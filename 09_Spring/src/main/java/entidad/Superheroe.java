package entidad;

public class Superheroe {
	private int id;
	private String nombre;
	private String nombreSuperheroe;
	private int poder;
	private String superpoder;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreSuperheroe() {
		return nombreSuperheroe;
	}

	public void setNombreSuperheroe(String nombreSuperheroe) {
		this.nombreSuperheroe = nombreSuperheroe;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public String getSuperpoder() {
		return superpoder;
	}

	public void setSuperpoder(String superpoder) {
		this.superpoder = superpoder;
	}

	@Override
	public String toString() {
		return "Superheroe [id=" + id + ", nombre=" + nombre + ", nombreSuperheroe=" + nombreSuperheroe + ", poder="
				+ poder + ", superpoder=" + superpoder + "]";
	}

}
