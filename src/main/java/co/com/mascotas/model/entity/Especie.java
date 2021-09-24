package co.com.mascotas.model.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especies")
public class Especie  {


@Id
@Column(name="id_especie")
private Integer idEspecie;
@Column(name="nombre_especie")
private String nombre;
@Column(name="descripcion_especie")
private String descripcion;



public Integer getIdEspecie() {
	return idEspecie;
}
public void setIdEspecie(Integer idEspecie) {
	this.idEspecie = idEspecie;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripion) {
	this.descripcion = descripion;
}
@Override
public String toString() {
	return "Especie [idEspecie=" + idEspecie + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
}


	
	
}
