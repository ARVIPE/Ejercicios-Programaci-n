package tema4.practicaexamenCompleta;

import java.util.ArrayList;

public class Baraja {
	public final int TAMANO_BARAJA = 52;
	private Carta cartas[] = new Carta[TAMANO_BARAJA];
	private ArrayList<Carta> cartasTomadas = new ArrayList<Carta>();

	public Baraja() {

		final String[] tipos = {Carta.PICAS, Carta.DIAMANTES, Carta.TREBOLES, Carta.CORAZONES};

		int palo = 0;
		for (final String tipo : tipos) {
			for (int i = 0; i < Carta.NUM_CARTAS_PALO; i++) {
				int indice = i + Carta.NUM_CARTAS_PALO*palo;
				cartas[indice] = new Carta(i + 1, tipo);
			}
			palo++;
		}

	}

	public void cartasDeAbajoHaciaArriba() {
		final Carta ultima = cartas[TAMANO_BARAJA-1];
		final Carta[] cartasTmp = cartas.clone();
		for (int i = 0; i < TAMANO_BARAJA-1; i++) {
			cartas[i+1] = cartasTmp[i];
		}
		cartas[0] = ultima;
	}

	public void cartasDeArribaHaciaAbajo() {
		imprimir();
		final Carta primera = cartas[0];
		final Carta[] cartasTmp = cartas.clone();
		for (int i = 0; i < TAMANO_BARAJA-2; i++) {
			cartas[i] = cartasTmp[i+1];
		}
		cartas[TAMANO_BARAJA-1] = primera;
		System.out.println("💥💥💥💥💥💥");
		imprimir();
	}

	public void imprimir() {
		System.out.println("Baraja");
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}

	public void mezclar() {
		for (int i = 0; i <= 52; i++) {
			// TO DO: Índices pueden ser iguales, con lo cual no se mezclarían las cartas
			final int indice1 = (int) Math.round(Math.random() * (cartas.length - 1));
			final int indice2 = (int) Math.round(Math.random() * (cartas.length - 1));

			final Carta aux = cartas[indice1];
			cartas[indice1] = cartas[indice2];
			cartas[indice2] = aux;

		}

	}
	
	public void ordenar() {
		for (int i = cartas.length - 1; i > 0; i--){
			for (int j = 0; j < i; j++){
				if (cartas[j].getId() > cartas[j + 1].getId()){	
					final Carta aux = cartas[j];
					cartas[j] = cartas[j + 1];
					cartas[j + 1] = aux;
				}
			}
		}
	}

	public void cogerCincoCartas(final Jugador jugador) {
		Carta[] miMano = new Carta[Jugador.TAMANO_MANO];

		for (int i = 0; i < Jugador.TAMANO_MANO; i++) {
			Carta carta = null;

			while (carta == null) {
				int indice = (int) Math.round(Math.random() * (TAMANO_BARAJA - 1));
				Carta cartaTemporal = this.cartas[indice];

				if (!this.cartasTomadas.contains(cartaTemporal)) {
					carta = cartaTemporal;
				}	
			}

			this.cartasTomadas.add(carta);
			miMano[i] = carta;
		}
		jugador.setMano(miMano);
	}
	
}
				
				