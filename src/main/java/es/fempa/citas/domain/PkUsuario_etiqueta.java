package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class PkUsuario_etiqueta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6513736228669297929L;

	@ManyToOne
	private Usuario etiquetante;
	@ManyToOne
	private Usuario etiquetado;
	@ManyToOne
	private Etiquetas etiqueta;
}
