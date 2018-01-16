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
public class Orientacion {
	@Id
	private Integer id_orientacion;
	private String orientacion;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
