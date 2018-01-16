package es.fempa.citas.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bloqueos {
	private int id_usuario1;
	private int id_usuario2;
}
