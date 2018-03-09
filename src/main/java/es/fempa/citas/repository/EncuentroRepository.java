package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Encuentro;
import es.fempa.citas.domain.Usuario;

public interface EncuentroRepository extends JpaRepository<Encuentro, Integer> {

	public List<Encuentro> findBySolicitante(Usuario u);
}
