package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.ColorPelo;
import es.fempa.citas.service.PeloService;

@RestController
public class PeloController {

	@Autowired
	private PeloService peloService;

	@GetMapping("/findAllPelo")
	public List<ColorPelo> findAll() {
		return this.peloService.findAll();
	}

	@GetMapping("/buscarIdPelo/{idColorPelo}")
	public List<ColorPelo> buscarId(@PathVariable Integer idColorPelo) {
		return this.peloService.buscarId(idColorPelo);
	}

}
