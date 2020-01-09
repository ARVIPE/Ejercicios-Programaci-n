package formula1Juego.formula1Juego;

public class Principal {

	public static void main(String[] args) {
		Carrera carrera1 = new Carrera();
		
		do {
			
			Carrera.avanzar();
			
		} while (Carrera.FinDeJuego() == false);
	}

}

