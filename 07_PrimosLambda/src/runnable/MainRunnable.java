package runnable;

import java.util.Scanner;

public class MainRunnable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		String respuesta = "";

		do {
			System.out.println("INTRODUZCA N�MERO");
			respuesta = sc.nextLine();
			int numero = Integer.parseInt(respuesta);

			Runnable runnable = () -> {
				double tiempo1 = System.currentTimeMillis();
				boolean primo = true;

				if (numero == 0 || numero == 1 || numero == 4) {
					primo = false;

				}
				for (int x = 2; x < numero / 2; x++) {

					if (numero % x == 0) {
						primo = false;

					}
				}

				if (primo) {
					System.out.println("Hilo : " + numero + " SI es primo");
				} else {
					System.out.println("Hilo : " + numero + " no es primo");
				}

				double tiempo2 = System.currentTimeMillis();
				System.out.println("Tiempo de ejecuci�n de hilo : " + (tiempo2 - tiempo1) + " ms");
			};

			Thread t = new Thread(runnable);

			t.start();
			System.out.println("QUIERE SALIR? Y/N");
			respuesta = sc.nextLine();

			if (respuesta.toLowerCase().contentEquals("y")) {
				salir = true;
			}

		} while (!salir);

		System.out.println("FIN");

	}

}
