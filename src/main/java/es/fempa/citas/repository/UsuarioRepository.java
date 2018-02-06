package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.fempa.citas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	public List<Usuario> findAll();
}
