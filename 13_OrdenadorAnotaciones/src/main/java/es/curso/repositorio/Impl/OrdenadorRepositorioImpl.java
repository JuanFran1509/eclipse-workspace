package es.curso.repositorio.Impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import es.curso.entidad.Ordenador;
import es.curso.repositorio.OrdenadorRepositorio;

public class OrdenadorRepositorioImpl implements OrdenadorRepositorio{
	@Override
	public boolean guardarOrdenador(Ordenador ordenador) {
		
		String fichero = "Ordenador.txt";
		
		try(FileOutputStream fos = new FileOutputStream(new File(fichero));
				ObjectOutputStream salida = new ObjectOutputStream(fos);) {

			salida.writeObject(ordenador.toString());
			
			return true;
			
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
		
	}
}
