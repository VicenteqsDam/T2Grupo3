package es.fempa.citas.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario_etiqueta {

	private int id_etiquetante;
	private int id_etiquetado;
	private int id_etiqueta;
}
