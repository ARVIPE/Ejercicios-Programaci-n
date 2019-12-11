package tema4.practicaexamenCompleta;

public class Principal {

	public static void main(String[] args) {

		Baraja baraja = new Baraja();
		Jugador[] jugadores = {
			new Jugador("Arturo"),
			new Jugador("Javi"),
			new Jugador("Inma"),
			new Jugador("Rosa"),
			new Jugador("Mª José"),
		};
		
		Poker poker = new Poker(jugadores, baraja);
		poker.repartir();

	}

}
