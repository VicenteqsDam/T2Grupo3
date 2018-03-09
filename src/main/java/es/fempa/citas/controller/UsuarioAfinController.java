package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.UsuarioAfin;
import es.fempa.citas.service.UsuarioAfinService;
import es.fempa.citas.utils.UsuarioUtils;

@RestController
public class UsuarioAfinController {

	@Autowired
	private UsuarioAfinService usuarioAfinService;

	@GetMapping("/afines")
	public List<UsuarioAfin> afines() {
		return this.usuarioAfinService.afines(UsuarioUtils.getUsuarioLogeado());
	}
}
