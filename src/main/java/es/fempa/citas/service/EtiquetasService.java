package es.fempa.citas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Etiquetas;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.Usuario_etiqueta;
import es.fempa.citas.repository.EtiquetasRepository;
import es.fempa.citas.repository.UsuarioEtiquetaRepository;

@Service
public class EtiquetasService {

	@Autowired
	public EtiquetasRepository etiquetasRepository;
	@Autowired
	public UsuarioEtiquetaRepository usuarioEtiquetaRepository;

	public List<Etiquetas> findAll() {
		return this.etiquetasRepository.findAll();
	}

	public List<Usuario> etiquetados(Etiquetas e, Usuario u) {
		List<Usuario_etiqueta> listadoUE = this.usuarioEtiquetaRepository.findByIdEtiquetaAndIdEtiquetante(e, u);
		List<Usuario> salida = new ArrayList<>();
		listadoUE.stream().forEach(ue -> salida.add(ue.getId().getEtiquetado()));
		return salida;
	}

}
