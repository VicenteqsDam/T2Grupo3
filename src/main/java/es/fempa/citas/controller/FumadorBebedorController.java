package es.fempa.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.fempa.citas.domain.FumadorBebedor;
import es.fempa.citas.service.FumadorBebedorService;

@RestController
public class FumadorBebedorController {
	@Autowired
	public FumadorBebedorService fumbebService;

	@GetMapping("/findAllFumadorBebedor")
	public List<FumadorBebedor> findAll() {
		return this.fumbebService.findAll();
	}

	@GetMapping("/buscaPorIdFumadorBebedor/{id}")
	public List<FumadorBebedor> findByidFumBeb(@PathVariable Integer id) {
		return this.fumbebService.findByidFumBeb(id);
	}
}
