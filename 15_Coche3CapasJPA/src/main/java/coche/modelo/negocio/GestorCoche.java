package coche.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import coche.modelo.entidad.Coche;
import coche.modelo.persistencia.CocheDAOJPA;

@Service
public class GestorCoche {
	@Autowired
	private CocheDAOJPA cocheDAO;

	@Transactional
	public int insertar(Coche c) {
		if (c.getMatricula().length() == 7 && !c.getMarca().isEmpty() && !c.getModelo().isEmpty()
				&& !c.getMatricula().isEmpty()) {

			return cocheDAO.insertar(c);

		}
		System.out.println("Los parámetros marca, modelo y matricula no pueden estar vacios, y el parámetro matricula debe ser de 7 carácteres");
		return 0;
	}

	@Transactional
	public Coche modificar(Coche c) {
		if (c.getMatricula().length() == 7 && !c.getMarca().isEmpty() && !c.getModelo().isEmpty()
				&& !c.getMatricula().isEmpty()) {

			return cocheDAO.modificar(c);

		}
		System.out.println("Los parámetros marca, modelo y matricula no pueden estar vacios, y el parámetro matricula debe ser de 7 carácteres");
		return null;
	}

	@Transactional
	public void borrar(int id) {
		cocheDAO.borrar(id);
	}


	public Coche buscar(int id) {
		return cocheDAO.buscar(id);
	}

	public List<Coche> listar() {
		return cocheDAO.listar();
	}
}
