package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.Sexo;
import es.fempa.citas.service.SexoService;

@RestController
public class SexoController {
	@Autowired
	public SexoService sexoService;

	@GetMapping("/findAllSexo")
	public List<Sexo> findAll() {
		return this.sexoService.findAll();
	}

	@GetMapping("/buscaPorIdSexo/{id}")
	public List<Sexo> findByidSexo(@PathVariable Integer id) {
		return this.sexoService.findByidSexo(id);
	}

}
