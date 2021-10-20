package entidad;

public class Perifericos {
	// Atributos
	private String nombre;
	private double precio;
	private String marca;
	private String modelo;

	// javabean
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Perifericos [nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + "]";
	}



}
