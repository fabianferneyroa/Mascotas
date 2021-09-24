package co.com.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.mascotas.model.entity.Dueño;

public interface DueñoRepository extends JpaRepository<Dueño, Long> {

}
