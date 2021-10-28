package es.curso.servicio.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import es.curso.entidad.Ordenador;
import es.curso.servicio.OrdenadorServicio;
import es.curso.repositorio.OrdenadorRepositorio;

public class OrdenadorServicioImpl implements OrdenadorServicio{

	@Autowired
	private OrdenadorRepositorio ordenadorRep;

	@Override
	public String guardarOrdenador(Ordenador ordenador) {
		if (ordenadorRep.guardarOrdenador(ordenador))
			return "Objeto guardado Correctamente en el fichero 'Ordenador.txt'\n"
					+ "Refresque el proyecto para visualizarlo";
		else
			return "Error al guardar el objeto";
		
	}

}
