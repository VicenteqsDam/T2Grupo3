package es.fempa.citas.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plan {
	@Id
	private Integer id_plan;
	private String plan;

	@OneToMany(mappedBy = "encuentro")
	private List<Encuentro> encuentro;
}
