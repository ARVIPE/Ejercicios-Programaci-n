package formula1Juego;

import java.lang.reflect.Array;

public class Pista {

	public Obstaculo obstaculo[] = new Obstaculo[4];

	public Pista() {

		for (int i = 0; i < obstaculo.length; i++) {
			
			int num = (int) Math.round(Math.random() * (1 - 0) + 1);
			
			if(num < 0.5f) {
				obstaculo[i] = new Rampa();
			}else{
				obstaculo[i] = new ManchaAceite();
			}
			
		}
	}
	
	public void sumarOrestarObstaculo () {
		
	}

}
