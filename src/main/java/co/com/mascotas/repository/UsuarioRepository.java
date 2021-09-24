package co.com.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.mascotas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	

}
