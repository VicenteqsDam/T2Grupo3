package es.fempa.citas.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.PKUsuarioAfin;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.UsuarioAfin;
import es.fempa.citas.domain.Usuario_intereses;
import es.fempa.citas.repository.UsuarioAfinRepository;

@Service
public class UsuarioAfinService {

	@Autowired
	public UsuarioAfinRepository usuarioAfinRepository;
	@Autowired
	public UsuarioInteresService usuarioInteresService;
	@Autowired
	public UsuarioService usuarioService;

	public void compararUsuarios() {
		List<Usuario> listaUsuarios = this.usuarioService.listaDeUsuarios();
		for (int i = 0; i < listaUsuarios.size(); i++) {
			for (int j = 0; j < listaUsuarios.size(); j++) {
				if (i != j) {
					UsuarioAfin ua = new UsuarioAfin();
					PKUsuarioAfin pkua = new PKUsuarioAfin();
					pkua.setComparado(listaUsuarios.get(i));
					pkua.setComparante(listaUsuarios.get(j));
					ua.setId(pkua);
					this.usuarioAfinRepository.save(ua);
				}
			}
		}
	}

	public List<UsuarioAfin> afines(Usuario comparado) {
		this.compararUsuarios();
		List<UsuarioAfin> usuariosAfines;
		usuariosAfines = this.usuarioAfinRepository.findByIdComparado(comparado);
		usuariosAfines.stream().forEach(ua -> ua.setPuntuacion(puntuar(ua)));
		Collections.sort(usuariosAfines);
		List<UsuarioAfin> listadoFiltrado = usuariosAfines.stream().filter(p -> p.getPuntuacion() > 20)
				.collect(Collectors.toList());
		return listadoFiltrado;
	}

	private Integer puntuar(UsuarioAfin ua) {
		Integer puntos = 0;
		List<Usuario_intereses> comparadoIntereses;
		List<Usuario_intereses> comparanteIntereses;
		comparadoIntereses = this.usuarioInteresService.interesDeUsuario(ua.getId().getComparado());
		comparanteIntereses = this.usuarioInteresService.interesDeUsuario(ua.getId().getComparante());
		// puntuacion por coincidencia de intereses
		for (int i = 0; i < comparadoIntereses.size(); i++) {
			for (int j = 0; j < comparanteIntereses.size(); j++) {
				if (comparadoIntereses.get(i).getId().getInteres() == comparanteIntereses.get(j).getId().getInteres()) {
					puntos += 10;
				}
			}
		}
		// puntuacion por fumador
		switch (ua.getId().getComparante().getFumador().getId()) {
		case 2: // ocasional
			if (ua.getId().getComparado().getBuscaFumador().getId() == 1) // en ningun caso
			{
				puntos = puntos - 100;
			}
			if (ua.getId().getComparado().getBuscaFumador().getId() == 2) // preferiblemente no
			{
				puntos = puntos - 20;
			}
			break;
		case 3: // habitual
			if (ua.getId().getComparado().getBuscaFumador().getId() == 1) // en ningun caso
			{
				puntos = puntos - 100;
			}
			if (ua.getId().getComparado().getBuscaFumador().getId() == 2) // preferiblemente no
			{
				puntos = puntos - 40;
			}
			break;
		}
		// puntuacion por bebedor
		switch (ua.getId().getComparante().getBebedor().getId()) {
		case 2: // ocasional
			if (ua.getId().getComparado().getBuscaBebedor().getId() == 1) // en ningun caso
			{
				puntos = puntos - 100;
			}
			if (ua.getId().getComparado().getBuscaBebedor().getId() == 2) // preferiblemente no
			{
				puntos = puntos - 20;
			}
			break;
		case 3: // habitual
			if (ua.getId().getComparado().getBuscaBebedor().getId() == 1) // en ningun caso
			{
				puntos = puntos - 100;
			}
			if (ua.getId().getComparado().getBuscaBebedor().getId() == 2) // preferiblemente no
			{
				puntos = puntos - 40;
			}
			break;
		}
		return puntos;
	}

}
