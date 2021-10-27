
public class Rezo extends Arma {
	private boolean sinergico;

	public Rezo(double daño, String tipo, boolean sinergico) {
		super(daño, tipo);
		this.sinergico = sinergico;

		if (sinergico) {
			setDaño(daño *= 2);
		} else {
			daño = daño;
		}
	}

}
