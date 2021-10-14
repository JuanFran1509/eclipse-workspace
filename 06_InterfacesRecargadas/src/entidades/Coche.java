package entidades;

public class Coche extends Vehiculo {

	public Coche(int id, double potenciaCaballos, String nombre, String tipo) {
		super(id, potenciaCaballos, nombre, tipo);
		this.tipo = "Normal";
	}

}
