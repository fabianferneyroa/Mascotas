package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.mascotas.model.entity.Dueño;
import co.com.mascotas.repository.DueñoRepository;

@Service
public class DueñoServiceImpl  implements DueñoService{

	@Autowired
	DueñoRepository dueñoRepository;
	
	@Override
	public Optional<Dueño> findById(Long id) {
	
		return dueñoRepository.findById(id);
	}

	@Override
	public List<Dueño> findAll() {
		
		return dueñoRepository.findAll();
	}

	@Override
	public Dueño save(Dueño dueño) {
		
		return dueñoRepository.save(dueño);
	}

	@Override
	public void deleteById(Long id) {
	 dueñoRepository.deleteById(id);
		
	}

}
