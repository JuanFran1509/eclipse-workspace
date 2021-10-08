
public class Hechizo extends Arma {
	private boolean efectivo;

	public Hechizo(double daño, String tipo, boolean efectivo) {
		super(daño, tipo);
		this.efectivo = efectivo;

		if (efectivo) {
			setDaño(daño *= 2);
		} else {
			daño = daño;
		}
	}

}
