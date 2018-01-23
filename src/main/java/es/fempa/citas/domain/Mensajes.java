package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Mensajes {
	@Id
	private int idMensajes;
	private int idEmisor;
	private int idReceptor;
	private String textoMensaje;
	private long fecha;
	private long hora;
}
