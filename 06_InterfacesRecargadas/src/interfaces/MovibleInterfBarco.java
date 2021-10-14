package interfaces;

import entidades.Vehiculo;

public interface MovibleInterfBarco {

	default void movimiento(double dist, Vehiculo v) {
		dist = dist + v.getPotenciaCaballos() * 2;
		System.out.println("El Vehiculo se esta moviendo por el agua");
		System.out.println("El Vehiculo: " + v.toString() + "se ha dezplazado: " + dist + "m");
	}
}
