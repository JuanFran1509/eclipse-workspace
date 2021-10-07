package actividad_01;

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

	public Procesador(double precio, double hz, String marca) {
		super();
		this.precio = precio;
		this.hz = hz;
		this.marca = marca;
	}

}
