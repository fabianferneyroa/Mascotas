package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import co.com.mascotas.model.entity.Usuario;

public interface UsuarioService {
	
	public Optional<Usuario> findById(Long id);
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(Long id);
	
	public Long ConsultarPorCredenciales(String contraseña, String email);

}
