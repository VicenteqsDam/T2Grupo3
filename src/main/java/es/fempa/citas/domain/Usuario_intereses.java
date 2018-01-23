package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario_intereses {
	@Id
	private int idUsuario;
	private int idInteres;
}
