package es.fempa.citas.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bloqueos {
	private int idUsuario1;
	private int idUsuario2;
}
