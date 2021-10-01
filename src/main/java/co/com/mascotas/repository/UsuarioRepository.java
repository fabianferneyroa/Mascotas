package co.com.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.mascotas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
@Query("select u.idUsuario from Usuario u where u.contraseñaUsuario=?1 and u.emailUsuario=?2")
	public Long ConsultarPorCredenciales(String ctr,String email);

}
