package entidad;

public class Coche {
	private int id;
	private String marca;
	private String modelo;
	private double numKm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getNumKm() {
		return numKm;
	}

	public void setNumKm(double numKm) {
		this.numKm = numKm;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", numKm=" + numKm + "]";
	}

}
