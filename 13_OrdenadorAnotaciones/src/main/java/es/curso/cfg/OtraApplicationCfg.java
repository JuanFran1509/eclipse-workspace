package es.curso.cfg;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.curso.entidad.Ordenador;
import es.curso.entidad.Ram;
import es.curso.marcas.Marca;
import es.curso.repositorio.OrdenadorRepositorio;
import es.curso.repositorio.Impl.OrdenadorRepositorioImpl;
import es.curso.servicio.OrdenadorServicio;
import es.curso.servicio.Impl.OrdenadorServicioImpl;
import es.curso.entidad.Monitor;
import es.curso.entidad.PlacaBase;
import es.curso.entidad.Raton;
import es.curso.entidad.Teclado;
import es.curso.entidad.TarjetaGrafica;
import es.curso.entidad.Procesador;
import utils.Util;

@Configuration
public class OtraApplicationCfg {
	@Bean
	public Ordenador ordenador() {
		Ordenador ordenador = new Ordenador();
		ordenador.setMarca(Util.getRandomMarca(Marca.getMarcaOrdenadores()));
		return ordenador;
	};
	@Bean
	public Ram ram1() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(200, 400));
		ram.setHz(50);
		ram.setGeneracion("ultima");
		return ram;
	};
	
	@Bean
	public Ram ram2() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(200, 400));
		ram.setHz(80);
		ram.setGeneracion("ultima");
		return ram;
	};
	
	@Bean
	public Ram ram3() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(200, 400));
		ram.setHz(300);
		ram.setGeneracion("ultima");
		return ram;
	};
	
	@Bean
	public Ram ram4() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(200, 400));
		ram.setHz(123);
		ram.setGeneracion("ultima");
		return ram;
	};
	
	@Bean
	public List<Ram> listRam(@Qualifier("ram1") Ram ram, @Qualifier("ram2") Ram ram2) {
		return List.of(ram, ram2);
	}
	
	@Bean
	public Procesador procesador() {
		Procesador procesador = new Procesador();
		procesador.setMarca(Util.getRandomMarca(Marca.getMarcaProcesadores()));
		procesador.setPrecio(Util.generateRandomNumber(200,400));
		procesador.setHz(120);
		return procesador;
	}
	
	public TarjetaGrafica grafica1(@Qualifier("ram3") Ram ram) {
		TarjetaGrafica grafica = new TarjetaGrafica();
		grafica.setMarca(Util.getRandomMarca(Marca.getMarcaGraficas()));
		grafica.setModelo("Nvidia gtx 1070ti");
		grafica.setRam(ram);
		grafica.setPrecio(Util.generateRandomNumber(300, 800));
		return grafica;
	}
	
	@Bean
	public TarjetaGrafica grafica2(@Qualifier("ram4") Ram ram) {
		TarjetaGrafica grafica = new TarjetaGrafica();
		grafica.setMarca(Util.getRandomMarca(Marca.getMarcaGraficas()));
		grafica.setModelo("Nvidia gtx 180ti");
		grafica.setRam(ram);
		grafica.setPrecio(Util.generateRandomNumber(500, 900));
		return grafica;
	}
	
	@Bean
	public List<TarjetaGrafica> listGraficas(@Qualifier("grafica1") TarjetaGrafica grafica1, 
			@Qualifier("grafica2") TarjetaGrafica grafica2) {
		return List.of(grafica1, grafica2);
	}
	
	@Bean 
	public Monitor monitor() {
		Monitor monitor = new Monitor();
		monitor.setPrecio(Util.generateRandomNumber(50, 200));
		monitor.setMarca(Util.getRandomMarca(Marca.getMarcaPerifericos()));
		monitor.setHz(120);
		monitor.setTamaño(30);
		return monitor;
	}
	
	@Bean 
	public Raton raton() {
		Raton raton = new Raton();
		raton.setPrecio(Util.generateRandomNumber(50, 100));
		raton.setMarca(Util.getRandomMarca(Marca.getMarcaPerifericos()));
		raton.setPeso(20);
		raton.setBotones(8);
		raton.setInalambrico(false);
		return raton;
	}
	
	@Bean
	public Teclado teclado() {
		Teclado teclado = new Teclado();
		teclado.setPrecio(Util.generateRandomNumber(50, 100));
		teclado.setMarca(Util.getRandomMarca(Marca.getMarcaPerifericos()));
		teclado.setTipo("Mecanico");
		return teclado;
	}
	
	/* PlacaBase Object */
	@Bean
	public PlacaBase placaBase() {
		PlacaBase placaBase = new PlacaBase();
		placaBase.setMarca(Util.getRandomMarca(Marca.getMarcaPlacasBase()));
		placaBase.setModel("10");
		placaBase.setPrecio(Util.generateRandomNumber(50, 100));
		return placaBase;
	}
	
	@Bean
	public OrdenadorServicio ordenadorService() {
		OrdenadorServicio ordenadorService = new OrdenadorServicioImpl();
		return ordenadorService;
	}
	
	/* OrdenadorRepository Object */
	@Bean
	public OrdenadorRepositorio ordenadorRepository() {
		OrdenadorRepositorio ordenadorRepository = new OrdenadorRepositorioImpl();
		return ordenadorRepository;
	}

}
