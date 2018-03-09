package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class PKUsuarioInteres implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3972570878868412821L;

	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Intereses interes;

}
