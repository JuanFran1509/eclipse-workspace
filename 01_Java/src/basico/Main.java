package basico;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo");

		// El ciclo de vida de un objeto en java desde que se crea
		// y mientras tenga una referencia apuntandolo, ya que
		// los objetos que no tienen referencia seran eliminados
		// por el recolector de basura
		/*
		 * while(true){ //El ciclo de vida de una referencia es desde que define //hasta
		 * el final del bloque donde se ha definido (el bloque //empieza con "{" y acaba
		 * con "}") Persona p1 = new Persona();
		 * 
		 * System.out.println("Creando otro objeto..."); }//muere p1
		 */

		// Un programa tendra tantos objetos (en principio) como
		// news hagais de ellos
		Persona p1 = new Persona();
		p1.setNombre("Steve Rogers");
		p1.setEdad(20);
		p1.setPeso(70);
		System.out.println(p1.toString());

		Persona p2 = p1;
		p1.setEdad(55);
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		cambiarEdad(p1);

		System.out.println(p1.getEdad());

		int cp = 41860; // los numeros en java que empiezan por 0 estan en base octal
		int hex = 0x21341; // hexadecimal
		int bin = 0b101; // binario
		System.out.println(cp);
		System.out.println(hex);
		System.out.println(bin);
		
		Persona p3 = new Persona();
		p3.setNombre("Tony Stark");
		p3.setEdad(39);
		p3.setPeso(80);
		
		Direccion d1 = new Direccion();
		p3.setDireccion(d1);
		p3.getDireccion().setCp("41860");
		p3.getDireccion().setCiudad("Sevilla");
		
		System.out.println(p3.getDireccion());
		

	}

	public static void cambiarEdad(Persona p) {
		p.setEdad(43);
	}// Muere p
}
