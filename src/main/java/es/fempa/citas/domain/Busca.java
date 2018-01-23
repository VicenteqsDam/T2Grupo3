package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Busca {
	@Id
	private int idBuscaFumBeb;
	private String busca;
}
