package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Busca implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4818303517806711712L;
	@Id
	private Integer id;
	private String busca;
}
