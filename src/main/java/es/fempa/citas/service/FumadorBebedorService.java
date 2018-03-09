package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.fempa.citas.domain.FumadorBebedor;
import es.fempa.citas.repository.FumadorBebedorRepository;

public class FumadorBebedorService {
	@Autowired
	public FumadorBebedorRepository fumbebRepository;

	public List<FumadorBebedor> findAll() {
		return this.fumbebRepository.findAll();
	}

	@GetMapping("/buscaPorId/{id}")
	public List<FumadorBebedor> findByidFumBeb(@PathVariable Integer id) {
		return this.fumbebRepository.findById(id);
	}
}
