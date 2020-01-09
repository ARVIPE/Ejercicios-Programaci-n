package Juegos.formula1Juego.formula1Juego;

import java.awt.Color;
import java.awt.Graphics;


public class ManchaAceite extends Obstaculo {

	public ManchaAceite(String nombre, int coordenada) {
		super(nombre);
		this.impulso = -5;
		this.color = Color.YELLOW;
		this.coordenada = coordenada;
	}
	//pintamos la macha
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(getPosicionObstaculo()*1000/100, coordenada, getExtensionDeUnObstaculo()*400/50, 1000/4);
		
	}
	
	public String toString() {
		return super.toString();
	}


	

	

	
	



}
