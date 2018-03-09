package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioFiltro {

	@Id
	private Integer id;
	private Long edad;
	@ManyToOne
	private Ciudad ciudad;
	@ManyToOne
	private ColorPelo colorPelo;
	@ManyToOne
	private Color_ojos colorOjos;
	private String nombre;
	private String apellidos;
	@ManyToOne
	private Sexo sexo;
	@ManyToOne
	private Pais paisOrigen;
	/*
	 * @OneToMany(mappedBy = "id.usuario") private List<Intereses> intereses;
	 */
	@ManyToOne
	private FumadorBebedor fumador;
	@ManyToOne
	private FumadorBebedor bebedor;
	private Double altura;
	private Double peso;

}
