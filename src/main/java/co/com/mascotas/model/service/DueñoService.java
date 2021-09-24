package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import co.com.mascotas.model.entity.Dueño;

public interface DueñoService {

	public Optional<Dueño>findById(Long id);
	public List<Dueño> findAll();
	public Dueño save(Dueño dueño);
	public void deleteById(Long id);
	
	
	
}
