package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Sexo;

public interface SexoRepository extends JpaRepository<Sexo, Integer> {
	// @Query("Select c from Sexo c where c.id = ?1")
	// Sexo buscaPorId(Long id);

	public List<Sexo> findByIdSexo(Integer id);

	public List<Sexo> findAll();
}
