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
public class Color_pelo {
	@Id
	private Integer id_color_pelo;
	private String color_pelo;

	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
