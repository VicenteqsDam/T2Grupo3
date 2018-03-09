package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.PKUsuarioAfin;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.UsuarioAfin;

public interface UsuarioAfinRepository extends JpaRepository<UsuarioAfin, PKUsuarioAfin> {

	public List<UsuarioAfin> findByIdComparado(Usuario comparado);

}
