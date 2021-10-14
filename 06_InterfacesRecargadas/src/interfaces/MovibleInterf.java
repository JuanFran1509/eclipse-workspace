package interfaces;

import entidades.Vehiculo;

public interface MovibleInterf {
	default void movimiento(double dist, Vehiculo v) {
		System.out.println("El Vehiculo: " + v.toString() + "se ha dezplazado: " + dist + "m");
	}

}
