package entidades;

import interfaces.MovibleInterf;
import interfaces.MovibleInterfAvion;
import interfaces.MovibleInterfBarco;

public class Vehiculo implements MovibleInterfBarco, MovibleInterfAvion, MovibleInterf {
	int id;
	double potenciaCaballos;
	String nombre;
	String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPotenciaCaballos() {
		return potenciaCaballos;
	}

	public void setPotenciaCaballos(double potenciaCaballos) {
		this.potenciaCaballos = potenciaCaballos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo(int id, double potenciaCaballos, String nombre, String tipo) {
		super();
		this.id = id;
		this.potenciaCaballos = potenciaCaballos;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", potenciaCaballos=" + potenciaCaballos + ", nombre=" + nombre + "]";
	}

	@Override
	public void movimiento(double dist, Vehiculo v) {
		if (v.getTipo() == "Normal") {
			MovibleInterf.super.movimiento(dist, v);
		} else if (v.getTipo() == "Avion") {
			MovibleInterfAvion.super.movimiento(dist, v);

		} else if (v.getTipo() == "Barco") {
			MovibleInterfBarco.super.movimiento(dist, v);
		} else {
			System.out.println("Error");
		}
	}

}
