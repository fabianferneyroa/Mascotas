package co.com.mascotas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@Column(name = "id_usuario")
	private Long idUsuario;
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	@Column(name = "apellidos_usuario")
	private String apellidosUsuario;
	@Column(name = "contraseña_usuario")
	private String contraseñaUsuario;
	@Column(name = "email_usuario")
	private String emailUsuario;
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidosUsuario() {
		return apellidosUsuario;
	}
	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}
	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}
	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", apellidosUsuario="
				+ apellidosUsuario + ", contraseñaUsuario=" + contraseñaUsuario + ", emailUsuario=" + emailUsuario
				+ "]";
	}
	
	

}
