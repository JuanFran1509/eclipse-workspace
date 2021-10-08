
public class Curandero extends Personaje {
	private double sabiduria;

public Curandero(String nombre, Arma arma, double vida, double sabiduria) {
	super(nombre, arma, vida);
	this.sabiduria = sabiduria;
	
	if(arma.getTipo() == "oracion") {
		arma.setDaño(sabiduria * arma.getDaño());
	}
}

}
