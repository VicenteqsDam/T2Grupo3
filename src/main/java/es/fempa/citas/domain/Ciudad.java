package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ciudad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5727496835808031234L;
	@Id
	private Integer idCiudad;
	private String nombreCiudad;

	@OneToOne
	private Pais pais;

}
