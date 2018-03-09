package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Pais;
import es.fempa.citas.repository.PaisRepository;

@Service
public class PaisService {

	@Autowired
	public PaisRepository paisRepository;

	public List<Pais> findAll() {
		return this.paisRepository.findAll();
	}

}
