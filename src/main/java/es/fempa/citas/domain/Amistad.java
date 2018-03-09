package es.fempa.citas.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Amistad {

	@EmbeddedId
	private PKAmistad amistad;
	private Boolean estado;
}
