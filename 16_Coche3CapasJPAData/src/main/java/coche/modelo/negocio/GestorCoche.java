package coche.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import coche.modelo.entidad.Coche;
import coche.modelo.persistencia.CocheDaoJPAData;

@Service
public class GestorCoche {
	@Autowired
	private CocheDaoJPAData cocheDAO;

	@Transactional
	public int insertar(Coche c) {
		if (c.getMatricula().length() == 7 && !c.getMarca().isEmpty() && !c.getModelo().isEmpty()
				&& !c.getMatricula().isEmpty()) {
			Coche cAux = cocheDAO.save(c);
			return cAux.getId();

		}
		System.out.println("Los parámetros marca, modelo y matricula no pueden estar vacios, y el parámetro matricula debe ser de 7 carácteres");
		return 0;
	}

	@Transactional
	public Coche modificar(Coche c) {
		if (c.getMatricula().length() == 7 && !c.getMarca().isEmpty() && !c.getModelo().isEmpty()
				&& !c.getMatricula().isEmpty()) {

			Coche cAux = cocheDAO.save(c);
			return cAux;

		}
		System.out.println("Los parámetros marca, modelo y matricula no pueden estar vacios, y el parámetro matricula debe ser de 7 carácteres");
		return null;
	}

	@Transactional
	public void borrar(int id) {
		cocheDAO.deleteById(id);
	}


	public Coche buscar(int id) {
		Coche cAux = cocheDAO.getOne(id);
		return cAux;
	}

	public List<Coche> listar() {
		return cocheDAO.findAll();
	}
}
