package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Intereses;
import es.fempa.citas.service.InteresesService;

@RestController
public class InteresesController {
	
	@Autowired
	private InteresesService interesesService;

	@GetMapping("/findAllIntereses")
	public List<Intereses> findAll() {
		List<Intereses> intereses = this.interesesService.findAll();
		return intereses;
	}

	@PostMapping("/saveInteres")
	public void saveInteres(@RequestBody Intereses i) {
		this.interesesService.saveInteres(i);
	}
	
	@GetMapping("/findInteres/{idInteres}")
	public Intereses buscarPorId(@PathVariable Long idInteres) {
		return this.interesesService.buscarPorId(idInteres);
	}

	@PostMapping("/addInteres}")
	public void addInteres(@RequestBody Intereses i) {
		this.interesesService.saveInteres(i);
	}

}
