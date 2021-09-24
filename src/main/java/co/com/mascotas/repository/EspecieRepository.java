package co.com.mascotas.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.mascotas.model.entity.Especie;
@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer>{

}
