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
	private Integer id_encuentro;
	private String Lugar;
	private long Fecha;
	private long hora;
	private int solicitante;
	private int solicitado;
	@ManyToOne
	private Plan plan;
	private boolean aceptado;
	private String comentarios_solicitador;
	private String comentarios_solicitado;
	private double valoracion_solicitante;
	private double valoracion_solicitado;
}
