
public class Arco extends Arma {
	private boolean flechasEnvenenadas;

	public Arco(double da�o, String tipo, boolean flechasEnvenenadas) {
		super(da�o, tipo);
		this.flechasEnvenenadas = flechasEnvenenadas;

		if (flechasEnvenenadas) {
			setDa�o(da�o *= 2);;
		} else {
			da�o = da�o;
		}
	}

}
