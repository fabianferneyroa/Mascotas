package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import co.com.mascotas.model.entity.Especie;

public interface EspecieService {
		
	//declaración de los cuatro metodos necesarios 
	
	    public Optional<Especie> findById(Integer id);
		public List<Especie> findAll();
		public Especie save(Especie especie);
		public void deleteById(Integer id);
	
}
