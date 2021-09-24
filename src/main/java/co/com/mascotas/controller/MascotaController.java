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

import co.com.mascotas.model.entity.Mascota;
import co.com.mascotas.model.service.MascotaService;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

	@Autowired
	private MascotaService mascotaService;
	
	@GetMapping("/{id}")
	public Optional<Mascota> buscarPorId(@PathVariable Integer id){
		
		return mascotaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Mascota> listar(){
		
		return mascotaService.findAll();
		
	}
	
	@PostMapping
	public Mascota guardar(@RequestBody Mascota mascota) {
		
		return mascotaService.save(mascota);
	}
	
	
	@PutMapping
	public Mascota actualizar(@RequestBody Mascota mascota) {
		
		Mascota mBD= mascotaService.findById(mascota.getIdMascota()).get();
		
		mBD.setNombre(mascota.getNombre());
		mBD.setEdad(mascota.getEdad());
		mBD.setDueño(mascota.getDueño());
		mBD.setEspecie(mascota.getEspecie());
		
		return mascotaService.save(mBD);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		mascotaService.deleteById(id);
	}
	
}
