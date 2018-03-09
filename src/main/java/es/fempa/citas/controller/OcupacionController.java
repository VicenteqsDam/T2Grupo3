package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Ocupacion;
import es.fempa.citas.service.OcupacionService;

@RestController
public class OcupacionController {

	@Autowired
	private OcupacionService ocupacionService;

	@GetMapping("/findAllOcupacion")
	public List<Ocupacion> findAll() {
		return this.ocupacionService.findAll();
	}

	@GetMapping("/buscarIdOcupacion/{idOcupacion}")
	public List<Ocupacion> buscarId(@PathVariable Integer idOcupacion) {
		return this.ocupacionService.buscarId(idOcupacion);
	}

}
