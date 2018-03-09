package es.fempa.citas.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;

import es.fempa.citas.domain.QUsuario;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.UsuarioFiltro;
import es.fempa.citas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario buscarId(Integer idUsuario) {
		return this.usuarioRepository.findByIdUsuario(idUsuario);
	}

	public List<Usuario> listaDeUsuarios() {
		return this.usuarioRepository.findAll();
	}

	public Iterable<Usuario> filtrarUsuarios(UsuarioFiltro uf) {
		QUsuario usuario = QUsuario.usuario;
		BooleanBuilder condicion = new BooleanBuilder();
		if (uf.getEdad() != null) {
			Calendar fecha = Calendar.getInstance();
			Long tiempo = fecha.getTimeInMillis() - uf.getEdad() * 31556900000l;
			Calendar fecha2 = Calendar.getInstance();
			fecha2.setTimeInMillis(tiempo);
			condicion.and(usuario.fechaNacimiento.year().eq(fecha2.get(fecha2.YEAR)));
		}
		if (uf.getCiudad() != null) {
			condicion.and(usuario.ciudad.eq(uf.getCiudad()));
		}
		if (uf.getColorOjos() != null) {
			condicion.and(usuario.colorOjos.eq(uf.getColorOjos()));
		}
		if (uf.getColorPelo() != null) {
			condicion.and(usuario.colorPelo.eq(uf.getColorPelo()));
		}
		if (uf.getNombre() != null) {
			condicion.and(usuario.nombre.eq(uf.getNombre()));
		}
		if (uf.getApellidos() != null) {
			condicion.and(usuario.apellidos.eq(uf.getApellidos()));
		}
		if (uf.getSexo() != null) {
			condicion.and(usuario.sexo.eq(uf.getSexo()));
		}
		if (uf.getPaisOrigen() != null) {
			condicion.and(usuario.paisOrigen.eq(uf.getPaisOrigen()));
		}
		if (uf.getFumador() != null) {
			condicion.and(usuario.fumador.eq(uf.getFumador()));
		}
		if (uf.getBebedor() != null) {
			condicion.and(usuario.bebedor.eq(uf.getBebedor()));
		}
		if (uf.getAltura() != null) {
			condicion.and(usuario.altura.eq(uf.getAltura()));
		}
		if (uf.getPeso() != null) {
			condicion.and(usuario.peso.eq(uf.getPeso()));
		}
		Iterable<Usuario> usuarios = this.usuarioRepository.findAll(condicion);
		return usuarios;
	}

	public void guardarCambios(Usuario u) {
		this.usuarioRepository.save(u);
	}

}
