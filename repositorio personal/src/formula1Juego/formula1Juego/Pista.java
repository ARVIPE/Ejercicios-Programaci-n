package formula1Juego.formula1Juego;

import java.util.ArrayList;
import java.util.List;

import java.awt.Color;
import java.awt.Graphics;

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
	
	public void paint (Graphics g) {		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 640, 120);
	}
	
	
}
		


