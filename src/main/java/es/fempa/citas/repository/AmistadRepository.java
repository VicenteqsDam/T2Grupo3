package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Amistad;
import es.fempa.citas.domain.PKAmistad;
import es.fempa.citas.domain.Usuario;

public interface AmistadRepository extends JpaRepository<Amistad, PKAmistad> {

	public List<Amistad> findByAmistadSolicitadoAndEstado(Usuario solicitado, Boolean estado);

	public List<Amistad> findByAmistadSolicitanteAndEstadoOrAmistadSolicitadoAndEstado(Usuario usuario, Boolean estado,
			Usuario usuario2, Boolean estado2);
}
