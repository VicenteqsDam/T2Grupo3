package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario_idioma {
	@Id
	private int idUsuarioIdioma;
	private int idUsuario;
	private int idIdioma;
}
