package coche.modelo.persistencia;

import java.util.List;

import coche.modelo.entidad.Coche;

public interface CocheDAO {

	int insertar(Coche c);	
	Coche modificar(Coche c);	
	int borrar(int id);	
	Coche buscar(int id);	
	List<Coche> listar();
}
