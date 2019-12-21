package formula1Juego;

import java.util.ArrayList;
import java.util.List;

public class Pista {
	
	List<Obstaculo> obstaculos = new ArrayList <Obstaculo>();
	
	
	public Pista() {
		
		for(int i = 0; i < 4; i++) {
			int numero = (int) Math.round(Math.random() * (1));
			
			if(numero < 0.5f) {
				obstaculos.add(new Rampa("Rampa"));
			}else{
				obstaculos.add(new ManchaAceite("Mancha Aceite"));
			}
		}
		
	}


	public List<Obstaculo> getObstaculos() {
		return obstaculos;
	}


	public void setObstaculos(List<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}
	
}
		


