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

import co.com.mascotas.model.entity.Especie;
import co.com.mascotas.model.service.EspecieService;

@RestController
@RequestMapping("/api/especies")
public class EspecieController {

	@Autowired
	EspecieService especieService;

	@GetMapping("/{id}")
	public Optional<Especie> buscarPorId(@PathVariable Integer id) {

		return especieService.findById(id);
	}

	@GetMapping("/listar")
	public List<Especie> listarTodos() {

		return especieService.findAll();
	}

	@PostMapping
	public Especie guardar(@RequestBody Especie especie) {

		return especieService.save(especie);
	}

	@PutMapping("/actualizar/{id}")
	public Especie actualizar(@RequestBody Especie especie, @PathVariable Integer id) {

		Especie eEnBD = especieService.findById(id).get();

		System.out.println("e por body: " + especie);
		System.out.println("en DB" + eEnBD);
		eEnBD.setNombre(especie.getNombre());
		eEnBD.setDescripcion(especie.getDescripcion());
		System.out.println("asi quedo en DB" + eEnBD);

		especieService.save(eEnBD);
		return especie;
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		especieService.deleteById(id);

	}

}
