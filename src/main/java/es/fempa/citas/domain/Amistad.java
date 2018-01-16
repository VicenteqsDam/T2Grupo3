package es.fempa.citas.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Amistad {
	private int id_solicitante;
	private int id_solicitado;
	private boolean estado;
}
