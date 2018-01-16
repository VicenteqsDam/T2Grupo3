package es.fempa.citas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pais {
	@Id
	private Integer id_pais;
	private String nombre_pais;

	@OneToMany(mappedBy = "ciudad")
	private List<Ciudad> ciudad;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
