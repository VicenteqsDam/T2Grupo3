package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Fumador_bebedor {
	@Id
	private int id_fum_beb;
	private String modalidad;
}
