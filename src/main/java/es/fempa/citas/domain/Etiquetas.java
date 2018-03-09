package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Etiquetas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8038224862494796458L;
	@Id
	private Integer idEtiquetas;
	private String nombre;
	private String icono;
}
