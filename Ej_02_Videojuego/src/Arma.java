
public class Arma {
private double daño;
private String tipo;
public double getDaño() {
	return daño;
}
public void setDaño(double daño) {
	this.daño = daño;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Arma(double daño, String tipo) {
	super();
	this.daño = daño;
	this.tipo = tipo;
}


}
