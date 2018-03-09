package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class PKUsuarioAfin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2640177383816093130L;
	@ManyToOne
	private Usuario comparado;
	@ManyToOne
	private Usuario comparante;

}
