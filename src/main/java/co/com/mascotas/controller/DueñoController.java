package co.com.mascotas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import co.com.mascotas.model.entity.Dueño;
import co.com.mascotas.model.service.DueñoService;

@RestController
@RequestMapping("/api/dueños")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class DueñoController {
	
	@Autowired 
	DueñoService dueñoService;
	
	@GetMapping("/{id}")
	public Optional<Dueño> BuscarPorId(@PathVariable Long id) {
		
		return dueñoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Dueño> listar(){
		
		return dueñoService.findAll();
	} 

	@PostMapping 
	public Dueño guardar(@RequestBody Dueño dueño) {
		
		return dueñoService.save(dueño);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		
		dueñoService.deleteById(id);
	}
	
	@PostMapping("/actualizar")
	public Dueño actualizar(@RequestBody Dueño dueño) {
		
	Dueño dEBD = dueñoService.findById(dueño.getIdDueño()).get();
	
	dEBD.setNombre(dueño.getNombre());
	dEBD.setApellidos(dueño.getApellidos());
	dEBD.setDireccion(dueño.getDireccion());
	dEBD.setTelefono(dueño.getTelefono());
	
	return dueñoService.save(dEBD);
	}

}
