package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Color_ojos;
import es.fempa.citas.service.ColorOjosService;

@RestController
public class ColorOjosController {

	@Autowired
	private ColorOjosService colorOjosService;

	@GetMapping("/ojos")
	public List<Color_ojos> findAll() {
		return this.colorOjosService.findAll();
	}

}
