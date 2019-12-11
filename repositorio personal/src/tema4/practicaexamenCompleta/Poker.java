package tema4.practicaexamenCompleta;

public class Poker {
	private final int NUM_JUGADORES = 5;

	private Jugador[] jugadores;
	private Baraja baraja;

	public Poker(Jugador[] jugadores, Baraja baraja) {
		if (jugadores.length != NUM_JUGADORES) {
			throw new RuntimeException("💥Se necesitan 5 jugadores");
		}
		this.jugadores = jugadores;
		this.baraja = baraja;
	}

	public void repartir() {
		for (Jugador jugador : jugadores) {
			baraja.cogerCincoCartas(jugador);

			jugador.mostrarCartas();
			
			jugador.jugada();
		}
	}
}