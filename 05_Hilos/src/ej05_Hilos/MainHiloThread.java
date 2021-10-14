package ej05_Hilos;

public class MainHiloThread {

	public static void main(String[] args) {
		HiloThread hilo1 = new HiloThread(2099999999);
		
		HiloThread hilo2 = new HiloThread(1);
		hilo2.setName("hilo2");
		
		HiloThread hilo3 = new HiloThread(89);
		hilo3.setName("hilo3");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	
		

	}

}
