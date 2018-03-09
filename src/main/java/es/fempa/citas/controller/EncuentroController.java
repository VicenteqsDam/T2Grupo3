package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.service.EncuentroService;
import es.fempa.citas.utils.UsuarioUtils;

@RestController
public class EncuentroController {

	@Autowired
	private EncuentroService encuentroService;

	@GetMapping("/encuentros")
	public List<Encuentro> encuentros() {
		return this.encuentroService.encuentros(UsuarioUtils.getUsuarioLogeado());
	}

	@PostMapping("/responderEncuentro")
	public void responderEncuentro(@RequestBody Encuentro e) {
		this.encuentroService.responderEncuentro(e);
	}

	@PostMapping("/solicitarEncuentro")
	public void solicitarEncuentro(@RequestBody Encuentro e) {
		this.encuentroService.solicitarEncuentro(e);
	}
}
