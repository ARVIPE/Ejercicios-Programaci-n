package formula1Juego.formula1Juego;

import java.util.ArrayList;
import java.util.List;

public class Pista {
	
	List<Obstaculo> obstaculos = new ArrayList <Obstaculo>();
	
	
	public Pista() {
		
		for(int i = 0; i < 4; i++) {
			int numero = (int) Math.round(Math.random() * (100 - 1) + 1);
			
			if(numero < 50) {
				obstaculos.add(new Rampa("Rampa"));
			}else{
				if(numero > 50){
				obstaculos.add(new ManchaAceite("Mancha Aceite"));
				}
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
		


