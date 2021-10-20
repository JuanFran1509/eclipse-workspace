package entidad;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SuperheroeMain {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Superheroe s1 = context.getBean("spidi", Superheroe.class);
		System.out.println(s1);

		Superheroe s2 = context.getBean("bat", Superheroe.class);
		System.out.println(s2);

		Superheroe s3 = context.getBean("budapest", Superheroe.class);
		System.out.println(s3);

		List<Superheroe> listaSuperheroe1 = context.getBean("listaSuperheroe1", List.class);

		List<Superheroe> listaSuperheroe2 = context.getBean("listaSuperheroe2", List.class);

		boolean llave = true;
		
		do {
			System.out.println("1- Acceder a los 3 super hereos\n" + "2- Add super heroe con potencia 100 a su lista\n"
					+ "3- Add super heroe que pueda volar a su lista\n" + "4- Listar super heroes con potencia 100\n"
					+ "5- Listar super heroes que puedan volar.");
			int num = reader.nextInt();
			switch (num) {
			case 1:
				System.out.println(s1 + "\n" + s2 + "\n" + s3);
				break;
			case 2:
				System.out.println("Introduce el id:");
				int id = reader.nextInt();
				System.out.println("Introduce el nombre:");
				String nombre = reader.next();
				System.out.println("Introduce el nombre de superheroe:");
				String nombreSuperheroe = reader.next();
				System.out.println("Introduce el super poder:");
				String superPoder = reader.next();

				Superheroe temporal1 = context.getBean("superHeroePrototype1", Superheroe.class);
				temporal1.setId(id);
				temporal1.setNombre(nombre);
				temporal1.setNombreSuperheroe(nombreSuperheroe);
				temporal1.setSuperpoder(superPoder);

				listaSuperheroe1.add(temporal1);
				break;
			case 3:
				System.out.println("Introduce el id:");
				int id2 = reader.nextInt();
				System.out.println("Introduce el nombre:");
				String nombre2 = reader.next();
				System.out.println("Introduce el nombre de superheroe:");
				String nombreSuperheroe2 = reader.next();
				System.out.println("Introduce el poder:");
				int poder2 = reader.nextInt();

				Superheroe temporal2 = context.getBean("superHeroePrototype2", Superheroe.class);
				temporal2.setId(id2);
				temporal2.setNombre(nombre2);
				temporal2.setNombreSuperheroe(nombreSuperheroe2);
				temporal2.setPoder(poder2);

				listaSuperheroe2.add(temporal2);
				break;
			case 4:
				for (Superheroe list1 : listaSuperheroe1) {
					System.out.println(list1);
				}
				break;
			case 5:
				for (Superheroe list2 : listaSuperheroe2) {
					System.out.println(list2);
				}
				break;

			default:
				System.out.println("Saliendo...");
				llave = false;
				break;
			}
		} while (llave);
	}

}
