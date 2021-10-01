package co.com.mascotas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.mascotas.model.entity.Usuario;
import co.com.mascotas.model.service.UsuarioService;
import co.com.mascotas.security.JWTUtil;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired 
	private JWTUtil jwtUtil;
	
	@GetMapping("/{id}")
	public Optional<Usuario> buscarPorId(@PathVariable Long id){
		
		return usuarioService.findById(id);
		
	}
	
	@GetMapping("/listar")
	public List<Usuario> buscarTodos(){
		
		return usuarioService.findAll();
		
	}
	
	@PostMapping
	public Usuario registrar(@RequestBody Usuario usuario) {
		
		return usuarioService.save(usuario);
		
	}
	
	@PutMapping
	public Usuario editar(@RequestBody Usuario usuario) {
		
      Usuario userBD = usuarioService.findById(usuario.getIdUsuario()).get();
      
      userBD.setNombreUsuario(usuario.getNombreUsuario());
      userBD.setApellidosUsuario(usuario.getApellidosUsuario());
      userBD.setContraseñaUsuario(usuario.getContraseñaUsuario());
      userBD.setEmailUsuario(usuario.getEmailUsuario());
      
      return usuarioService.save(userBD);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		
		usuarioService.deleteById(id);
		
	}
	
	@GetMapping("/validar")
	public String validar(@RequestBody Usuario usuario) {
		
	String email= usuario.getEmailUsuario();
	String ctr= usuario.getContraseñaUsuario();

	Usuario user= usuarioService.findById(usuarioService.ConsultarPorCredenciales(ctr,email)).get();
	
	if(user !=null) {
		
		//crear jwt
	String token =jwtUtil.crearToken(String.valueOf(user.getIdUsuario()), user.getEmailUsuario());
	
		return token;
	}else {
		return"incorrecto";
		
	}
	
	
	
	}

}

