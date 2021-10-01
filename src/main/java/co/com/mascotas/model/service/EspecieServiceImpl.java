package co.com.mascotas.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.mascotas.model.entity.Especie;
import co.com.mascotas.repository.EspecieRepository;

@Service
public class EspecieServiceImpl implements EspecieService {

	
	@Autowired
	private EspecieRepository especieRepository;
	
	@Override
	public Optional<Especie> findById(Integer id) {
		
		return especieRepository.findById(id);
	}

	@Override
	public List<Especie> findAll() {
		// TODO Auto-generated method stub
		return especieRepository.findAll();
	}

	@Override
	public Especie save(Especie especie) {
		// TODO Auto-generated method stub
		return especieRepository.save(especie);
	}

	@Override
	public void deleteById(Integer id) {
		especieRepository.deleteById(id);

	}

}

