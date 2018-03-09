package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Ciudad;


public interface CiudadRespository extends JpaRepository<Ciudad, Long> {

	public List<Ciudad> findByIdCiudad(Long id);
	
	public List<Ciudad> findAll();
}
