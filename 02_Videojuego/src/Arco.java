
public class Arco extends Arma {
	private boolean flechasEnvenenadas;

	public Arco(double daño, String tipo, boolean flechasEnvenenadas) {
		super(daño, tipo);
		this.flechasEnvenenadas = flechasEnvenenadas;

		if (flechasEnvenenadas) {
			setDaño(daño *= 2);;
		} else {
			daño = daño;
		}
	}

}
