package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.mascotas.model.entity.Mascota;
import co.com.mascotas.repository.MascotaRepository;

@Service
public class MascotaServiceImpl implements MascotaService{

	
	@Autowired
	
	private MascotaRepository mascotaRepository;
	@Override
	public Optional<Mascota> findById(Integer id) {
		
		return mascotaRepository.findById(id);
	}

	@Override
	public List<Mascota> findAll() {
	
		return mascotaRepository.findAll();
	}
	
	@Override
	public Mascota save(Mascota mascota) {
		
		return mascotaRepository.save(mascota);
	}

	@Override
	public void deleteById(Integer id) {
		mascotaRepository.deleteById(id);
		
	}

}
