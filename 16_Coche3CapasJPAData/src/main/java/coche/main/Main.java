package coche.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import coche.cfg.ConfiguracionJPA;
import coche.modelo.entidad.Coche;
import coche.modelo.negocio.GestorCoche;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		context = new AnnotationConfigApplicationContext(ConfiguracionJPA.class);

		GestorCoche gp = context.getBean(GestorCoche.class);
		Coche coche = null;

		System.out.println("Introduzca el número de lo que desea hacer: ");
		String menu = "(1.Añadir, 2.Eliminar, 3.Modificar, 4.Buscar o 5.Listar):";

		int llave = 0;

		do {
			System.out.println(menu);
			llave = Integer.parseInt(sc.nextLine());

			switch (llave) {
			case 1:
				coche = new Coche();
				datosCoche(coche, sc);
				int id = gp.insertar(coche);
				System.out.println("id insertado: " + id);
				break;
			case 2:
				System.out.print("Escribe la id del coche:");
				int id2 = sc.nextInt();
				System.out.println("Coche borrado");
				gp.borrar(id2);
				break;
			case 3:
				try {
					coche = new Coche();
					System.out.print("Escribe la id: ");
					int id3 = sc.nextInt();
					coche.setId(id3);
					datosCoche(coche, sc);
					gp.modificar(coche);
					System.out.println("Coche modificado");
				} catch (NumberFormatException e) {
					System.out.println("ERROR: el id debe ser numerico");
				}

				break;
			case 4:
				System.out.print("Escribe la id: ");
				int id4 = Integer.parseInt(sc.nextLine());
				System.out.println("Búsqueda del coche");
				System.out.println(gp.buscar(id4));
				break;
			case 5:
				System.out.print("Lista de todos los coches");
				List<Coche> lista = gp.listar();

				lista.forEach((c) -> System.out.println(c));
				break;
			case 0:
				break;

			}
		} while (llave != 0);
		
		sc.close();
	}

	private static void datosCoche(Coche coche, Scanner sc) {
		System.out.print("Introduzca la marca:");
		String marcaM = sc.nextLine();
		coche.setMarca(marcaM);
		System.out.print("Introduzca el modelo:");
		String modeloM = sc.nextLine();
		coche.setModelo(modeloM);
		System.out.print("Introduzca los kilometros:");
		String kmM = sc.nextLine();
		coche.setKm(Integer.parseInt(kmM));
		System.out.print("Introduzca la matricula:");
		String matriculaM = sc.nextLine();
		coche.setMatricula(matriculaM);

	}

}
