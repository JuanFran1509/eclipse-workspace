package ej05_Hilos;

public class HiloThread extends Thread{
	
	private double num;

	public HiloThread(double num) {
		super();
		this.num = num;
	}
	
	@Override
	public void run() {
		long inicio = System.currentTimeMillis();
		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		
		if(this.num % 2 == 0) {
			System.out.println("El número " + this.num + " es par");
		}else {
			System.out.println("El número " + this.num + " es impar");
		}
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long fin = System.currentTimeMillis();
		double tiempo = (double) ((fin - inicio)/1000);
		
		System.out.println(Thread.currentThread().getName() + " acabado");
		System.out.println("El hilo duro: "+ tiempo +" segundos");
		
		
	}

}
