package Juegos.Arkanoid.Codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Objeto {
	
	public Color color;
	public int xCoord, yCoord;
	public int ancho, alto;
	protected BufferedImage spriteActual = null;
		
	public Objeto() {

	}
	
	
	public abstract void paint(Graphics g);
	
	protected abstract void movimiento();
	

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
