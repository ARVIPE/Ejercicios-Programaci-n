package formula1Juego;

public class principal {

	public static void main(String[] args) {
		
		Carrera coche = new Carrera();
		
		do {
			coche.avanzar();
		}while(!coche.FinDeJuego());
		

	}

}
