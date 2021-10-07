package actividad_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Creación de componentes
		Perifericos periferico1 = new Perifericos("Ratón", 10, "Razer", "231123");
		Perifericos periferico2 = new Perifericos("Auriculares", 30, "Razer", "234959");

		PlacaBase placa1 = new PlacaBase(70, "Acer", "123466");

		Procesador procesador1 = new Procesador(300, 120, "Intel");

		Ram ram1 = new Ram(50, 90, "ultima");
		Ram ram2 = new Ram(50, 90, "ultima");

		TarjetaGrafica tarjetaGrafica1 = new TarjetaGrafica(350, "Nvidia", "1080Ti");

		// Creación de listas
		List<Perifericos> listaPerifericos = new ArrayList<Perifericos>();
		listaPerifericos.add(periferico1);
		listaPerifericos.add(periferico2);

		List<Ram> listaRam = new ArrayList<Ram>();
		listaRam.add(ram1);
		listaRam.add(ram2);

		List<TarjetaGrafica> listaTarjetaGrafica = new ArrayList<TarjetaGrafica>();
		listaTarjetaGrafica.add(tarjetaGrafica1);

		// Creación del ordenador
		Ordenador ordenador = new Ordenador("Acer", listaRam, procesador1, listaTarjetaGrafica, listaPerifericos,
				placa1);

		// Mostrar datos ordenador
		System.out.println(ordenador);

		// Calcular precio
		System.out.println(ordenador.calcularPrecioComponentes());

	}

}
