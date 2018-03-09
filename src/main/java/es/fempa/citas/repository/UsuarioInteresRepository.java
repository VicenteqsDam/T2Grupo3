package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.PKUsuarioInteres;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.Usuario_intereses;

public interface UsuarioInteresRepository extends JpaRepository<Usuario_intereses, PKUsuarioInteres> {

	public List<Usuario_intereses> findByIdUsuario(Usuario usuario);

}
