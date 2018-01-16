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
	private int id_usuario;
	private String nombre;
	private String apellidos;
	private String email;
	private long fecha_nacimiento;
	@ManyToOne
	private Ciudad ciudad;
	private int codigo_postal;
	@ManyToOne
	private Sexo sexo;
	@ManyToOne
	private Orientacion orientacion;
	private String contraseña;
	@ManyToOne
	private Color_pelo color_pelo;
	@ManyToOne
	private Color_ojos color_ojos;
	@ManyToOne
	private Estudios estudios;
	@ManyToOne
	private Ocupacion ocupacion;
	@ManyToOne
	private int id_fumador; // ?
	@ManyToOne
	private int id_bebedor; // ?
	@ManyToOne
	private int id_busca_fumador; // ?
	@ManyToOne
	private int id_busca_bebedor; // ?
	@ManyToOne
	private Pais pais;
	@ManyToOne
	private int id_pais_origen; // ?
	private double altura;
	private double peso;
	private String descripcion;
	private String perfil;
	private int edad_minima;
	private int edad_maxima;
}
