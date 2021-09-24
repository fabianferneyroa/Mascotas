package co.com.mascotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dueños")
public class Dueño {
	
	@Id
	@Column(name="id_dueño")
	private Long idDueño;
	
	@Column(name = "nombre_dueño")
	private String nombre;
	
	@Column(name = "apellidos_dueño")
	private String apellidos;
	
	@Column(name = "direccion_dueño")
	private String direccion;
	
	@Column(name="telefono_dueño")
	private String telefono;

	public Long getIdDueño() {
		return idDueño;
	}

	public void setIdDueño(Long idDueño) {
		this.idDueño = idDueño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Dueño [idDueño=" + idDueño + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
	
	
}
