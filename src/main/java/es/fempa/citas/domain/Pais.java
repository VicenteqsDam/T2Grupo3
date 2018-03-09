package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5065772145137335360L;
	@Id
	private Integer idPais;
	private String nombrePais;

}
