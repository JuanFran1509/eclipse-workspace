
public class Guerrero extends Personaje{
private double fuerza;

public Guerrero(String nombre, Arma arma, double vida, double fuerza) {
	super(nombre, arma, vida);
	this.fuerza = fuerza;
	
	if((arma.getTipo() == "mele") || (arma.getTipo() == "distancia")) {
		arma.setDaño(fuerza * arma.getDaño());
	}
}







}
