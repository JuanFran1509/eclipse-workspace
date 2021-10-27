import java.util.Scanner;

public class MainVideojuego {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Espada armaP1 = new Espada(30, "mele", false);
		Arco armaP2 = new Arco(50, "distancia", false);
		Hechizo h1 = new Hechizo(70, "embrujo", false);

		Guerrero g1 = new Guerrero("papi", armaP1, 500, 20);
		Mago m1 = new Mago("Merlin", h1, 2000, 2);
		Personaje p1 = new Personaje("Papichulo", armaP1, 300);
		Personaje p2 = new Personaje("Papichulo resurection", armaP2, 300);

		boolean key = true;
		while(key) {
			
			atacar(g1, m1);
			System.out.println("Pulsa para la siguiente ronda");
			String name = sc.nextLine();
			
			atacar(m1, g1);
			System.out.println("Pulsa para la siguiente ronda");
			name = sc.nextLine();
			
			if(g1.getVida()<= 0 || p2.getVida() <= 0) {
				key = false;
			}else {
				key = true;
			}
			
		}
		// System.out.println(m1.getArma().getDaño());

	}

	public static void atacar(Personaje p1, Personaje p2) {
		p2.setVida(p2.getVida() - p1.getArma().getDaño());

		if (p2.getVida() <= 0) {
			System.out.println("El personaje " + p2.getNombre() + " ha muerto");
		}else if(p1.getVida() <= 0){
			System.out.println("El personaje " + p1.getNombre() + " ha muerto");
		}
		else {
			System.out.println(
					p1.getNombre() + " hizo un daño de: " + p1.getArma().getDaño() + "con " + p1.getArma().getTipo());
			System.out.println(
					p2.getNombre() + " recibió: " + p1.getArma().getDaño() + " de daño, vida restante:" + p2.getVida());
		}
	};
}
