package es.fempa.citas.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {
	@Id
	@GeneratedValue
	private int idUsuario;
	private String nombre;
	private String apellidos;
	private String email;
	private long fechaNacimiento;
	@ManyToOne
	private Ciudad ciudad;
	private int codigoPostal;
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
	@ManyToOne
	private int idFumador; // ?
	@ManyToOne
	private int idBebedor; // ?
	@ManyToOne
	private int idBuscaFumador; // ?
	@ManyToOne
	private int idBuscaBebedor; // ?
	@ManyToOne
	private Pais pais;
	@ManyToOne
	private int idPaisOrigen; // ?
	private double altura;
	private double peso;
	private String descripcion;
	private String perfil;
	private int edadMinima;
	private int edadMaxima;
}
