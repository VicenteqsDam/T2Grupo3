package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import es.fempa.citas.domain.Ciudad;
import es.fempa.citas.domain.ColorPelo;
import es.fempa.citas.domain.Color_ojos;
import es.fempa.citas.domain.FumadorBebedor;
import es.fempa.citas.domain.Pais;
import es.fempa.citas.domain.Sexo;
import es.fempa.citas.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>, QueryDslPredicateExecutor<Usuario> {

	public Usuario findByIdUsuario(Integer id);

	public Usuario findByUsername(String nombre);

	public List<Usuario> findByCiudadAndColorOjosAndColorPeloAndNombreAndApellidosAndSexoAndPaisOrigenAndFumadorAndBebedorAndAlturaAndPeso(
			Ciudad c, Color_ojos cO, ColorPelo cP, String nombre, String apellidos, Sexo s, Pais pO,
			FumadorBebedor fumador, FumadorBebedor bebedor, double altura, double peso);

}
