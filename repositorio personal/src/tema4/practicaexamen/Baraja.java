package tema4.practicaexamen;

import java.util.Arrays;

public class Baraja {
	Carta carta[] = new Carta[52];

	public Baraja() {
		int j = 0;
		for (int i = 0; i < 13; i++) {
			carta[j] = new Carta(i + 1, "Picas", j);
			j++;
		}
		for (int i = 0; i < 13; i++) {
			carta[j] = new Carta(i + 1, "Diamantes", j);
			j++;
		}
		for (int i = 0; i < 13; i++) {
			carta[j] = new Carta(i + 1, "Treboles", j);
			j++;
		}
		for (int i = 0; i < 13; i++) {
			carta[j] = new Carta(i + 1, "Corazones", j);
			j++;
		}

	}

	/*
	 * 
	 */

	public void cartasdeArribaHaciaAbajo() {
		for (int i = 1; i < carta.length; i++) {
			Carta aux = carta[i - 1];
			carta[i - 1] = carta[i];
			carta[i] = aux;
		}
	}

	public void cartasdeAbajoHaciaArriba() {
		for (int i = 1; i < carta.length; i--) {
			Carta aux = carta[i];
			carta[i] = carta[i - 1];
			carta[i - 1] = aux;
		}

	}

	public void imprimir() {
		System.out.println("Baraja");
		for (int i = 0; i < carta.length; i++) {
			System.out.println(carta[i]);
		}
	}
}		
				
				
				
				