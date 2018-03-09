package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.FumadorBebedor;

public interface FumadorBebedorRepository extends JpaRepository<FumadorBebedor, Integer> {

	public List<FumadorBebedor> findById(Integer id);

	public List<FumadorBebedor> findAll();
}
