package main;

import entidades.Avion;
import entidades.Barco;
import entidades.Moto;
import entidades.Vehiculo;
import entidades.Coche;

public class Main {

	public static void main(String[] args) {
		Avion a1 = new Avion(1, 100, "Concordia", "Avion");
		Barco b1 = new Barco(2, 300, "Titanic", "Barco");
		Moto m1 = new Moto(3, 150, "Kawasaki", "Normal");
		Coche c1 = new Coche(4, 75, "Mazda", "Normal");
		
		Vehiculo arrayVehiculos[] = new Vehiculo[] {a1,b1,m1,c1};
		
		for (int i = 0; i < arrayVehiculos.length; i++) {
			arrayVehiculos[i].movimiento(500, arrayVehiculos[i]);
		}
		
		
	}

}
