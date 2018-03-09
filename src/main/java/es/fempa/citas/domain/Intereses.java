package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Intereses implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1219689184465320385L;
	@Id
	private Integer idIntereses;
	private String interes;
}
