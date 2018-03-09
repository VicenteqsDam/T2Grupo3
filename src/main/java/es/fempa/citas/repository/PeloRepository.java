package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.ColorPelo;

public interface PeloRepository extends JpaRepository<ColorPelo, Integer> {

	public List<ColorPelo> findByIdColorPelo(int idColorPelo);

}
