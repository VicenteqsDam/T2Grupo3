package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.service.CiudadService;

@RestController
public class CiudadController {
	
	@Autowired
	private CiudadService ciudadService;

	@GetMapping("/findAllCiudad")
	public List<Ciudad> findAll() {
		return this.ciudadService.findAll();
	}

	@PostMapping("/saveCiudad")
	public void saveCoche(@RequestBody Ciudad c) {
		this.ciudadService.saveCiudad(c);
	}

	@GetMapping("/findCiudad/{id}")
	public List<Ciudad> buscarPorId(@PathVariable Long idPais) {
		return this.ciudadService.buscarPorId(idPais);
	}

	@PostMapping("/addCiudad")
	public void addCar(@RequestBody Ciudad c) {
		this.ciudadService.saveCiudad(c);
	}

}
