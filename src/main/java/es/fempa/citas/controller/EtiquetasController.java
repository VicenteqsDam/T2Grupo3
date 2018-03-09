package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Etiquetas;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.EtiquetasService;
import es.fempa.citas.utils.UsuarioUtils;

@RestController
public class EtiquetasController {

	@Autowired
	private EtiquetasService etiquetasService;

	@GetMapping("/etiquetas")
	public List<Etiquetas> findAll() {
		return this.etiquetasService.findAll();
	}

	@GetMapping("/etiqueta/{id}")
	public List<Usuario> etiquetados(@PathVariable Etiquetas id) {
		return this.etiquetasService.etiquetados(id, UsuarioUtils.getUsuarioLogeado());
	}

}
