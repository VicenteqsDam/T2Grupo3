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
public class Sexo {
	@Id
	private Integer idSexo;
	private String nombreSexo;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
