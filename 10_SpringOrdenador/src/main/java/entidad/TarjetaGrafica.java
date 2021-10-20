package entidad;

public class TarjetaGrafica {
	// Atributos
	private double precio;
	private String marca;
	private String modelo;

	// javabean
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
		return "TarjetaGrafica [precio=" + precio + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
}
