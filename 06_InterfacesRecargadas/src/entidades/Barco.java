package entidades;

public class Barco extends Vehiculo {

	public Barco(int id, double potenciaCaballos, String nombre, String tipo) {
		super(id, potenciaCaballos, nombre, tipo);
		this.tipo = "Barco";
	}

}
