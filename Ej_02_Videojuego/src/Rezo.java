
public class Rezo extends Arma {
	private boolean sinergico;

	public Rezo(double da�o, String tipo, boolean sinergico) {
		super(da�o, tipo);
		this.sinergico = sinergico;

		if (sinergico) {
			setDa�o(da�o *= 2);
		} else {
			da�o = da�o;
		}
	}

}
