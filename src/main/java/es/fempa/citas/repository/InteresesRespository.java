package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Intereses;


public interface InteresesRespository extends JpaRepository<Intereses, Long> {

	public Intereses findByIdIntereses(Long id);

	public List<Intereses> findAll();
	
}
