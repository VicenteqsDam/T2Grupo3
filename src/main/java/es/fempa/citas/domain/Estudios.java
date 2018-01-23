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
public class Estudios {
	@Id
	private Integer idEstudios;
	private String estudio;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
