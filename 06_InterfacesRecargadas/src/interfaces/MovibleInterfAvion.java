package interfaces;

import entidades.Vehiculo;

public interface MovibleInterfAvion {
	default void movimiento(double dist, Vehiculo v) {
		dist = dist + v.getPotenciaCaballos() * 3;
		System.out.println("El vehiculo se esta moviendo por el aire");
		System.out.println("El Vehiculo: " + v.toString() + "se ha dezplazado: " + dist + "m");
	}
}
