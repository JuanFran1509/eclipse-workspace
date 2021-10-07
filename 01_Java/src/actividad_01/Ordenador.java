package actividad_01;

//imports
import java.util.List;

public class Ordenador {
	// Atributos
	private String marca;
	private List<Ram> listaRam;
	private Procesador procesador;
	private List<TarjetaGrafica> listaTarjetaGrafica;
	private List<Perifericos> listaPerifericos;
	private PlacaBase placaBase;

	// Métodos Javabean
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<Ram> getListaRam() {
		return listaRam;
	}

	public void setListaRam(List<Ram> listaRam) {
		this.listaRam = listaRam;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public List<TarjetaGrafica> getListaTarjetaGrafica() {
		return listaTarjetaGrafica;
	}

	public void setListaTarjetaGrafica(List<TarjetaGrafica> listaTarjetaGrafica) {
		this.listaTarjetaGrafica = listaTarjetaGrafica;
	}

	public List<Perifericos> getListaPerifericos() {
		return listaPerifericos;
	}

	public void setListaPerifericos(List<Perifericos> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}

	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", listaRam=" + listaRam + ", procesador=" + procesador
				+ ", listaTarjetaGrafica=" + listaTarjetaGrafica + ", listaPerifericos=" + listaPerifericos
				+ ", placaBase=" + placaBase + "]";
	}

	public Ordenador(String marca, List<Ram> listaRam, Procesador procesador, List<TarjetaGrafica> listaTarjetaGrafica,
			List<Perifericos> listaPerifericos, PlacaBase placaBase) {
		super();
		this.marca = marca;
		this.listaRam = listaRam;
		this.procesador = procesador;
		this.listaTarjetaGrafica = listaTarjetaGrafica;
		this.listaPerifericos = listaPerifericos;
		this.placaBase = placaBase;
	}

	// Funciones

	public double calcularPrecioComponentes() {
		// Variable donde se acumula el precio
		double precio = 0;

		// Precio de Ram
		for (int i = 0; i < listaRam.size(); i++) {
			precio += this.listaRam.get(i).getPrecio();
		}

		// Precio de procesador
		precio += this.procesador.getPrecio();

		// Precio de trajeta grafica
		for (int i = 0; i < listaTarjetaGrafica.size(); i++) {
			precio += this.listaTarjetaGrafica.get(i).getPrecio();
		}

		// Precio de perifericos
		for (int i = 0; i < listaPerifericos.size(); i++) {
			precio += this.listaPerifericos.get(i).getPrecio();
		}

		// Precio placa base
		precio += this.placaBase.getPrecio();

		return precio;

	}

}
