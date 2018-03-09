package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.fempa.citas.domain.Sexo;
import es.fempa.citas.repository.SexoRepository;

public class SexoService {

	@Autowired
	public SexoRepository sexoRepository;

	public List<Sexo> findAll() {
		return this.sexoRepository.findAll();
	}

	@GetMapping("/buscaPorId/{id}")
	public List<Sexo> findByidSexo(@PathVariable Integer id) {
		return this.sexoRepository.findByIdSexo(id);
	}

}
