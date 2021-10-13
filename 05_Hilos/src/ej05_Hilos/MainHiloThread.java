package ej05_Hilos;

public class MainHiloThread {

	public static void main(String[] args) {
		HiloThread hilo1 = new HiloThread(50);
		hilo1.setName("hilo1");
		
		HiloThread hilo2 = new HiloThread(35);
		hilo2.setName("hilo2");
		
		HiloThread hilo3 = new HiloThread(999999999);
		hilo3.setName("hilo3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	
		

	}

}
