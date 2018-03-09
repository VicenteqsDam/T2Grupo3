package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioAfin implements Serializable, Comparable<UsuarioAfin> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7456142874563300095L;

	@EmbeddedId
	private PKUsuarioAfin id;
	private Integer puntuacion; // = puntuar();

	@Override
	public int compareTo(UsuarioAfin o) {
		return o.getPuntuacion().compareTo(this.getPuntuacion());
	}

	/*
	 * public UsuarioAfin() { puntuacion = puntuar(); }
	 */

}
