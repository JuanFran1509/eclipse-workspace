
public class Espada extends Arma {
	private boolean afilada;

	public Espada(double daño, String tipo, boolean afilada) {
		super(daño, tipo);
		this.afilada = afilada;

		if (afilada) {
			setDaño(daño *= 2);
		} else {
			daño = daño;
		}
	}

}
