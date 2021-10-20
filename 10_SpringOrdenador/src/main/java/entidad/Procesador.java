package entidad;

public class Procesador {
	// Atributos
	private double precio;
	private double hz;
	private String marca;

	// javabean
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getHz() {
		return hz;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Procesador [precio=" + precio + ", hz=" + hz + ", marca=" + marca + "]";
	}

}
