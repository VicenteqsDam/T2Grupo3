package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.ColorPelo;
import es.fempa.citas.repository.PeloRepository;

@Service
public class PeloService {

	@Autowired
	public PeloRepository peloRepository;

	public List<ColorPelo> findAll() {
		return this.peloRepository.findAll();
	}

	public List<ColorPelo> buscarId(Integer idColorPelo) {
		return this.peloRepository.findByIdColorPelo(idColorPelo);
	}

}
