package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Encuentro {
	private double valoracion;
	@Id
	private Integer idEncuentro;
	private String Lugar;
	private long Fecha;
	private long hora;
	private int solicitante;
	private int solicitado;
	@ManyToOne
	private Plan plan;
	private boolean aceptado;
	private String comentariosSolicitador;
	private String comentariosSolicitado;
	private double valoracionSolicitante;
	private double valoracionSolicitado;
}
