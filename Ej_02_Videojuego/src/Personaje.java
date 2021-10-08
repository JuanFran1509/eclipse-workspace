
public class Personaje {
	private String nombre;
	private Arma arma;
	private double vida;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Arma getArma() {
		return arma;
	}


	public void setArma(Arma arma) {
		this.arma = arma;
	}





	public Personaje(String nombre, Arma arma, double vida) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.vida = vida;
	}


	public double getVida() {
		return vida;
	}


	public void setVida(double vida) {
		this.vida = vida;
	}



}
