
public class Espada extends Arma {
	private boolean afilada;

	public Espada(double da�o, String tipo, boolean afilada) {
		super(da�o, tipo);
		this.afilada = afilada;

		if (afilada) {
			setDa�o(da�o *= 2);
		} else {
			da�o = da�o;
		}
	}

}
