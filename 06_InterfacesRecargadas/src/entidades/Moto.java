package entidades;

public class Moto extends Vehiculo {

	public Moto(int id, double potenciaCaballos, String nombre, String tipo) {
		super(id, potenciaCaballos, nombre, tipo);
		this.tipo = "Normal";
	}

}
