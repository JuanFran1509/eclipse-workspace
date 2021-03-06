package es.curso.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.Configuracion;
import es.curso.modelo.entidad.Cliente;
import es.curso.modelo.entidad.Pedido;
import es.curso.modelo.negocio.GestorCliente;
import es.curso.modelo.negocio.GestorPedido;

public class MainJdbcTemplate {

	static Scanner sc = new Scanner(System.in);
	private static ApplicationContext context;

	public static void main(String[] args) throws ParseException {
		context = new AnnotationConfigApplicationContext(Configuracion.class);

		int eleccion = 0;

		do {
			System.out.println("\n--------------------------------------");
			System.out.println("Buenas, ¿que desea hacer? \n 1: Dar de alta un cliente. \n 2: Dar de baja un cliente. "
					+ "\n 3: Modificar un cliente. \n 4: Buscar un cliente por nombre. \n 5: Buscar un cliente por ID. "
					+ "\n 6: Anadir un pedido a un cliente. \n 7: Listar los pedidos de un cliente. \n 8: Salir");
			System.out.println("--------------------------------------");
			eleccion = sc.nextInt();

			switch (eleccion) {

			case 1:
				altaCliente();
				break;

			case 2:
				bajaCliente();
				break;

			case 3:
				modificarCliente();
				break;

			case 4:
				buscaNombre();
				break;

			case 5:
				buscaID();
				break;

			case 6:
				altaPedidoCliente();
				break;

			case 7:
				buscaPedidosID();
				break;
			}

		} while (eleccion != 8);
		System.out.println("¡Hasta luego!");
	}

	public static void altaCliente() {
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		Cliente c = new Cliente();
		System.out.println("Introduzca los datos del cliente: \nNOMBRE:");
		c.setNombre(sc.next());
		System.out.println("EDAD:");
		c.setEdad(sc.nextInt());
		gc.insertarCliente(c);

	}

	public static void bajaCliente() {
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		int id;
		System.out.println("Introduzca el ID del cliente de la lista que deasea borrar: ");
		System.out.println(gc.listarCliente());
		id = sc.nextInt();
		gc.borrar(id);

	}

	public static void modificarCliente() {
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		Cliente c = new Cliente();
		int id;
		System.out.println("Introduzca el ID del cliente de la lista que deasea modificar: ");
		System.out.println(gc.listarCliente());
		id = sc.nextInt();
		if (gc.buscarID(id) != null) {
			System.out.println("Introduzca los nuevos datos del cliente: \nNOMBRE:");
			c.setNombre(sc.next());
			System.out.println("EDAD:");
			c.setEdad(sc.nextInt());
			gc.modificarCliente(c, id);
		}
	}

	public static void buscaNombre() {
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		String nombre;
		System.out.println("Introduzca el nombre del cliente que deasea buscar: ");
		nombre = sc.next();
		gc.buscarNombre(nombre);

	}

	public static void buscaID() {
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		int id;
		System.out.println("Introduzca el ID del cliente que deasea buscar: ");
		id = sc.nextInt();
		gc.buscarID(id);

	}

	public static void altaPedidoCliente() throws ParseException {
		GestorPedido gp = context.getBean("gestorPedido", GestorPedido.class);
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		
		Pedido p = new Pedido();
		int id;
		Date fechaDate;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Introduce el ID del cliente de la siguiente lista: ");
		System.out.println(gc.listarCliente());
		id = sc.nextInt();

		System.out.println("introduzca los datos del pedido: \nIMPORTE (si tiene decimales ponga , )");
		p.setImporte(sc.nextDouble());

		System.out.println("FECHA (dd/MM/yyyy):");
		fechaDate = sdf.parse(sc.next());
		p.setFecha(fechaDate);

		gp.insertarPedidoCliente(p, id);

	}

	public static void buscaPedidosID() {
		GestorPedido gp = context.getBean("gestorPedido", GestorPedido.class);
		GestorCliente gc = context.getBean("gestorCliente", GestorCliente.class);
		int id;
		System.out.println("Introduzca el ID del cliente de la lista cuyos pedidos deasea buscar: ");
		System.out.println(gc.listarCliente());
		id = sc.nextInt();
		gp.listarPedidoCliente(id);

	}
}
