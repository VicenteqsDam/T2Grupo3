package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Amistad;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.service.AmistadService;
import es.fempa.citas.utils.UsuarioUtils;

@RestController
public class AmistadController {

	@Autowired
	private AmistadService amistadService;

	@GetMapping("/misAmigos")
	public List<Amistad> miAmigos() {
		return this.amistadService.misAmigos(UsuarioUtils.getUsuarioLogeado());
	}

	@GetMapping("/solicitudesAmistad")
	public List<Amistad> solicitudesAmistad() {
		return this.amistadService.solicitudesAmistad(UsuarioUtils.getUsuarioLogeado());
	}

	@GetMapping("/amistad/{solicitado}")
	public void solicitarAmistad(@PathVariable Usuario solicitado) {
		this.amistadService.saveAmistad(UsuarioUtils.getUsuarioLogeado(), solicitado);
	}

	@PostMapping("/responderAmistad")
	public void responderAmistad(@RequestBody Amistad a) {
		this.amistadService.responderAmistad(a);
	}
}
