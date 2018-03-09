package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Ocupacion;
import es.fempa.citas.repository.OcupacionRepository;

@Service
public class OcupacionService {

	@Autowired
	public OcupacionRepository ocupacionRepository;

	public List<Ocupacion> findAll() {
		return this.ocupacionRepository.findAll();
	}

	public List<Ocupacion> buscarId(Integer idOcupacion) {
		return this.ocupacionRepository.findByIdOcupacion(idOcupacion);
	}

}