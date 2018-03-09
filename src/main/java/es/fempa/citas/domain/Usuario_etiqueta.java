package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario_etiqueta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5061085839476879813L;

	@EmbeddedId
	private PkUsuario_etiqueta id;
}
