package formula1Juego;

public class principal {

	public static void main(String[] args) {
		
		Carrera coche = new Carrera("Circuito de Mónaco");
		
		do {
			Carrera.avanzar();
		}while(!coche.FinDeJuego());
		
	}

}
