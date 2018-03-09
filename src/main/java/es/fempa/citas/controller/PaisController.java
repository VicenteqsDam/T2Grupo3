package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Pais;
import es.fempa.citas.service.PaisService;

@RestController
public class PaisController {

	@Autowired
	private PaisService paisService;

	@GetMapping("/pais")
	public List<Pais> findAll() {
		return this.paisService.findAll();
	}

}
