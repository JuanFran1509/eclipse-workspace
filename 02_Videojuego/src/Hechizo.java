
public class Hechizo extends Arma {
	private boolean efectivo;

	public Hechizo(double da�o, String tipo, boolean efectivo) {
		super(da�o, tipo);
		this.efectivo = efectivo;

		if (efectivo) {
			setDa�o(da�o *= 2);
		} else {
			da�o = da�o;
		}
	}

}
