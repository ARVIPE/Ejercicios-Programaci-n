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
		for (int i = 51; i > 0; i--) {
			Carta aux = carta[i];
			carta[i] = carta[i - 1];
			carta[i - 1] = aux;
		}
		/*
		 * 
		 */
	}

	public void imprimir() {
		System.out.println("Baraja");
		for (int i = 0; i < carta.length; i++) {
			System.out.println(carta[i]);
		}
	}

	public void mezclarBaraja() {
		for (int i = 0; i <= 52; i++) {
			int indice1 = (int) Math.round(Math.random() * (carta.length - 1));
			int indice2 = (int) Math.round(Math.random() * (carta.length - 1));

			Carta aux = carta[indice1];
			carta[indice1] = carta[indice2];
			carta[indice2] = aux;

		}

	}
	
	public void ordenar() {
		for (int i = carta.length - 1; i > 0; i--){
			for (int j = 0; j < i; j++){
				if (carta[j].getId() > carta[j + 1].getId()){	
					Carta aux = carta[j];
					carta[j] = carta[j + 1];
					carta[j + 1] = aux;
					
				
				}
			}
		}
	}
	
	public void cogerCarta(Jugador jugador) {
		Carta mano[] = new Carta[5];
		int azar = 0;
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < mano.length; j++) {
			
					azar = (int) Math.round(Math.random() * (carta.length - 1));
				
				System.out.println(carta[azar]);
				
				if(carta[j].getId() == carta[j].getId()) {
					azar = (int) Math.round(Math.random() * (carta.length - 1));
				}
				
				
				
				
				
			}
			
			
		}
			
		
	}
	
	
	
}
				
				