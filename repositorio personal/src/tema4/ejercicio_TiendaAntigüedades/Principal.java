package tema4.ejercicio_TiendaAntig�edades;

public class Principal {

	public static void main(String[] args) {
		joya joya = new joya(1940, "españa", 56.80f, "oro");
		libro libro = new libro(1997, "EEUU", 10.00f, "JKRowling", "Harry Potter");
	
		
		System.out.println(joya.toString());
		System.out.println(libro.toString());
		

	}

}