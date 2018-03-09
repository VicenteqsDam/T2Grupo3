package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Color_ojos implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3700118139287847686L;

	@Id
	private Integer idColorOjos;
	private String colorOjos;
}
