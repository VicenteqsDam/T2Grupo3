package es.fempa.citas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import es.fempa.citas.domain.Etiquetas;
import es.fempa.citas.domain.Usuario;
import es.fempa.citas.domain.Usuario_etiqueta;

public interface UsuarioEtiquetaRepository extends JpaRepository<Usuario_etiqueta, Usuario> {

	@Query("Select ue from Usuario_etiqueta ue where ue.id.etiqueta=?1 and ue.id.etiquetante=?2")
	public List<Usuario_etiqueta> etiquetados(Etiquetas e, Usuario u);

	public List<Usuario_etiqueta> findByIdEtiquetaAndIdEtiquetante(Etiquetas e, Usuario u);
}
