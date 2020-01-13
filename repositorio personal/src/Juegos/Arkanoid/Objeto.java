package Juegos.Arkanoid;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Objeto {
	
	public Color color;
	public int xCoord, yCoord;
	public int ancho, alto;
	
	public Objeto() {
		super();
	}
	
	public abstract void paint(Graphics g);
	
	public abstract void mover();

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
 	
	
	
		
}
