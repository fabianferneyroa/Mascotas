package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import co.com.mascotas.model.entity.Mascota;

public interface MascotaService {

	public Optional<Mascota> findById(Integer id);
	public List<Mascota> findAll();
	public Mascota save(Mascota mascota);
	public void deleteById(Integer id);
	
}
