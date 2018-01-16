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
	private int id_mensajes;
	private int id_emisor;
	private int id_receptor;
	private String texto_mensaje;
	private long fecha;
	private long hora;
}
