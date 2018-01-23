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
public class Ocupacion {
	@Id
	private Integer idOcupacion;
	private String ocupacion;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
