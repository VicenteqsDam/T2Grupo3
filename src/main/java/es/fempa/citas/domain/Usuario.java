package es.fempa.citas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5378226911715997365L;

	@Id
	@GeneratedValue
	private Integer idUsuario;
	private String nombre;
	private String apellidos;
	@Column(name = "email")
	private String username;
	private long fechaNacimiento;
	@ManyToOne
	private Ciudad ciudad;
	private Integer codigoPostal;
	@ManyToOne
	private Sexo sexo;
	@ManyToOne
	private Orientacion orientacion;
	private String contraseña;
	@ManyToOne
	private Color_pelo colorPelo;
	@ManyToOne
	private Color_ojos colorOjos;
	@ManyToOne
	private Estudios estudios;
	@ManyToOne
	private Ocupacion ocupacion;
	private Integer idFumador;
	private Integer idBebedor;
	private Integer idBuscaFumador;
	private Integer idBuscaBebedor;
	@ManyToOne
	private Pais pais;
	@ManyToOne
	private Pais paisOrigen;
	private double altura;
	private double peso;
	private String descripcion;
	private String perfil;
	private Integer edadMinima;
	private Integer edadMaxima;

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "usuario_intereses") // , joinColumns = @JoinColumn(name =
	 * "usuarioIdUsuario"), inverseJoinColumns // = @JoinColumn(name =
	 * "interesIdInteres")) private List<Intereses> Intereses;
	 */

	// @ManyToMany
	// @JoinTable(name = "usuario_intereses")
	// private List<Intereses> Usuario_intereses;
}
