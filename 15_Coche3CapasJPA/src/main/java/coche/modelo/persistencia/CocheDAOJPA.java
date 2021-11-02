package coche.modelo.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import coche.modelo.entidad.Coche;

@Repository
public class CocheDAOJPA {

	@PersistenceContext
	private EntityManager em;

	public int insertar(Coche c) {
		em.persist(c);
		return c.getId();
	}

	public Coche modificar(Coche c) {
		return em.merge(c);
	}

	public Coche buscar(int id) {
		return em.find(Coche.class, id);
	}

	public int borrar(int id) {
		Coche pAux = em.find(Coche.class, id);
		em.remove(pAux);
		return pAux.getId();
	}
	
	@SuppressWarnings("unchecked")
	public List<Coche> listar() {
		List<Coche> listaCoches = em.createQuery("from Coche c").getResultList();
		return listaCoches;
	}

}
