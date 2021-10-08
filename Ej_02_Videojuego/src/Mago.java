
public class Mago extends Personaje{
private double inteligencia;

public Mago(String nombre, Arma arma, double vida, double inteligencia) {
	super(nombre, arma, vida);
	this.inteligencia = inteligencia;
	
	if(arma.getTipo() == "embrujo") {
		arma.setDaño(inteligencia * arma.getDaño());
	}
}






}
