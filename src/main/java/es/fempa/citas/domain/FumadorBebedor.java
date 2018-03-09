package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FumadorBebedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6297335646215902512L;
	@Id
	private Integer id;
	private String modalidad;

}
