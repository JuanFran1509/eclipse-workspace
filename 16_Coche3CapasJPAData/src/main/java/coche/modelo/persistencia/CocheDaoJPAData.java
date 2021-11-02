package coche.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coche.modelo.entidad.Coche;

@Repository
public interface CocheDaoJPAData extends JpaRepository<Coche, Integer>{

}
