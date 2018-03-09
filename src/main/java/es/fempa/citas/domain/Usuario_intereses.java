package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario_intereses implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7487461456346832277L;

	@EmbeddedId
	private PKUsuarioInteres id;
}
