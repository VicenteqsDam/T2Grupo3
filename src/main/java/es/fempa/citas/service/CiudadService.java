package es.fempa.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.repository.CiudadRespository;

@Service
public class CiudadService {
	
	@Autowired
	public CiudadRespository ciudadRepository;
	
	public List<Ciudad> findAll(){
		List<Ciudad> ciudades = this.ciudadRepository.findAll();
		return ciudades;
	}
	
	public void saveCiudad(Ciudad c) {
		this.ciudadRepository.save(c); 
	}
	
	public List<Ciudad> buscarPorId(Long idPais) {
		return this.ciudadRepository.findByIdCiudad(idPais);
	}

}
