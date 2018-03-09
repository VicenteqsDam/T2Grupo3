package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Color_ojos;
import es.fempa.citas.repository.ColorOjosRepository;

@Service
public class ColorOjosService {

	@Autowired
	public ColorOjosRepository colorOjosRepository;

	public List<Color_ojos> findAll() {
		return this.colorOjosRepository.findAll();
	}
}
