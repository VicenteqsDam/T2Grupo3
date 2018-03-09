package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class PKAmistad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1806093896548092653L;
	@ManyToOne
	private Usuario solicitante;
	@ManyToOne
	private Usuario solicitado;
}
