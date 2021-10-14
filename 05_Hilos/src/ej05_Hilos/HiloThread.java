package ej05_Hilos;

public class HiloThread extends Thread {

	private double num;

	public HiloThread(double num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		long inicio = System.currentTimeMillis();

		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		int contador = 2;
		boolean primo = true;

		if (num < 2) {
			System.out.println("El numero tiene que ser mayor que 2");
		} else {
			while ((primo) && (contador != num)) {
				if (num % contador == 0) {
					primo = false;
				}
				contador++;
			}

			if (primo) {
				System.out.println("El número: " + num + "es primo");
			} else {
				System.out.println("El número: " + num + "no es primo");
			}
		}

		long fin = System.currentTimeMillis();
		double tiempo = (double) ((fin - inicio) / 1000);

		System.out.println(Thread.currentThread().getName() + " acabado");
		System.out.println("El hilo duro: " + tiempo + " segundos");

	}

}
