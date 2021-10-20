package entidad;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrdenadorMain {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Ordenador o1 = context.getBean("ordenador", Ordenador.class);
		
		
		/*o1.setListaPerifericos(context.getBean("listaperifericos", ArrayList.class));
		o1.setListaRam(context.getBean("listaram", ArrayList.class));
		o1.setListaTarjetaGrafica(context.getBean("listatarjetagrafica", ArrayList.class));
		o1.setMarca("Acer");
		o1.setPlacaBase(context.getBean("placabase", PlacaBase.class));
		o1.setProcesador(context.getBean("procesador", Procesador.class));
		*/
		
		System.out.println(o1);
	}

}
