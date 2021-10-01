package co.com.mascotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascotas")
public class Mascota {

	@Id
	@Column(name="id_mascota")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMascota; 
	
	@Column(name = "nombre_mascota")
	private String nombre;
	
	@Column(name = "edad_mascota")
	private int edad;
	
	@ManyToOne
	@JoinColumn(name="especie_mascota")
	private Especie especie;
	
	@ManyToOne
	@JoinColumn(name = "id_dueño")
	private Dueño dueño;

	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public Dueño getDueño() {
		return dueño;
	}

	public void setDueño(Dueño dueño) {
		this.dueño = dueño;
	}
	
	
	
}
