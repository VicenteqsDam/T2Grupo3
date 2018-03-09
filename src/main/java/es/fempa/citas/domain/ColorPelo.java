package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ColorPelo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1251846768178499840L;
	@Id
	private Integer idColorPelo;
	private String colorPelo;

}
