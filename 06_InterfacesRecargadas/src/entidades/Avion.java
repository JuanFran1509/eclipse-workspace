package entidades;

public class Avion extends Vehiculo {

	public Avion(int id, double potenciaCaballos, String nombre, String tipo) {
		super(id, potenciaCaballos, nombre, tipo);
		this.tipo = "Avion";
	}

}
