package es.fempa.citas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ciudad {
	@Id
	private Integer idCiudad;
	private String nombreCiudad;

	@ManyToOne
	private Pais pais;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
