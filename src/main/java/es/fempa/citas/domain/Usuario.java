package es.fempa.citas.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Calendar fechaNacimiento;
	@ManyToOne
	private Ciudad ciudad;
	private Integer codigoPostal;
	@ManyToOne
	private Sexo sexo;
	@ManyToOne
	private Orientacion orientacion;
	@JsonIgnore
	private String password;
	@ManyToOne
	private ColorPelo colorPelo;
	@ManyToOne
	private Color_ojos colorOjos;
	@ManyToOne
	private Estudios estudios;
	@ManyToOne
	private Ocupacion ocupacion;
	@ManyToOne
	private FumadorBebedor fumador;
	@ManyToOne
	private FumadorBebedor bebedor;
	@ManyToOne
	private Busca buscaFumador;
	@ManyToOne
	private Busca buscaBebedor;
	@ManyToOne
	private Pais pais;
	@ManyToOne
	private Pais paisOrigen;
	private Double altura;
	private Double peso;
	private String descripcion;
	private String perfil;
	private Integer edadMinima;
	private Integer edadMaxima;

	@ManyToMany
	@JoinTable(name = "usuario_interes", joinColumns = @JoinColumn(name = "ID_USUARIO", referencedColumnName = "idUsuario"), inverseJoinColumns = @JoinColumn(name = "INTERES_ID", referencedColumnName = "idInteres"))
	List<Intereses> intereses;
}
