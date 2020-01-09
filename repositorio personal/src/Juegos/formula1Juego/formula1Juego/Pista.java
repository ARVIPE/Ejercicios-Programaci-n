package Juegos.formula1Juego.formula1Juego;

import java.util.ArrayList;
import java.util.List;

import java.awt.Color;
import java.awt.Graphics;

public class Pista {
	
	List<Obstaculo> obstaculos = new ArrayList <Obstaculo>();
	int casillaDeSalida = 0;
	private static int longitud = 100;
	
	public Pista(int casillaDeSalida) {
		this.casillaDeSalida = casillaDeSalida;
		crearObstaculo();
	}
	
	
	
	public void crearObstaculo() {	
		for(int i = 0; i < 4; i++) {
			int numero = (int) Math.round(Math.random() * (100 - 1) + 1);
			
			if(numero < 50) {
				obstaculos.add(new Rampa("Rampa", casillaDeSalida));
			}else{
				if(numero > 50){
				obstaculos.add(new ManchaAceite("Mancha Aceite" , casillaDeSalida));
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

	
	
	public static int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public void paint (Graphics g) {		
		int ancho = 1000;
		int alto = 100;
		g.drawRect(0, 0, ancho, alto);
		for(Obstaculo obstaculo : obstaculos) {
			obstaculo.paint(g);
		}
	}
	
	
}
		


