package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Ocupacion;

public interface OcupacionRepository extends JpaRepository<Ocupacion, Integer> {

	public List<Ocupacion> findByIdOcupacion(Integer idOcupacion);

}