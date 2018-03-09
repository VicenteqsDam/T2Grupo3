package es.fempa.citas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Encuentro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4730926047940250121L;
	@Id
	private Integer idEncuentro;
	private String Lugar;
	private Long Fecha;
	private Long hora;
	@ManyToOne
	private Usuario solicitante;
	@ManyToOne
	private Usuario solicitado;
	@ManyToOne
	private Plan plan;
	private Boolean aceptado;
	private Double valoracion;
	private String comentariosSolicitador;
	private String comentariosSolicitado;
	private Double valoracionSolicitante;
	private Double valoracionSolicitado;
}
