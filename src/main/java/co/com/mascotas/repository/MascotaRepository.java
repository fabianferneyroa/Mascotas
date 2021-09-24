package co.com.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.mascotas.model.entity.Mascota;

public interface MascotaRepository  extends JpaRepository<Mascota, Integer>{

}
