package Juegos.formula1Juego.formula1Juego;

import java.awt.Graphics;

import javafx.scene.paint.Color;

public abstract class Obstaculo {
	
	private String nombre;
	private int posicionObstaculo;
	protected int impulso;
	private int extensionDeUnObstaculo;
	protected int coordenada;
	protected java.awt.Color color;


	public Obstaculo(String nombre) {
		super();
		this.posicionObstaculo = (int) Math.round(Math.random() * (100 - 1) + 1);
		this.nombre = nombre;
		this.impulso = 0;
		this.extensionDeUnObstaculo = ((int) Math.round(Math.random() * (3 - 1) + 1));
	}


	public int getCoordenada() {
		return coordenada;
	}


	public void setCoordenada(int coordenada) {
		this.coordenada = coordenada;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPosicionObstaculo() {
		return posicionObstaculo;
	}


	public void setPosicionObstaculo(int posicionObstaculo) {
		this.posicionObstaculo = posicionObstaculo;
	}


	public int getImpulso() {
		return impulso;
	}


	public void setImpulso(int impulso) {
		this.impulso = impulso;
	}


	@Override
	public String toString() {
		return "Obstaculo [nombre=" + nombre + ", posicionObstaculo=" + posicionObstaculo + "]";
	}


	public int getExtensionDeUnObstaculo() {
		return extensionDeUnObstaculo;
	}


	public void setExtensionDeUnObstaculo(int extensionDeUnObstaculo) {
		this.extensionDeUnObstaculo = extensionDeUnObstaculo;
	}


	public abstract void paint(Graphics g);


	public java.awt.Color getColor() {
		return color;
	}


	public void setColor(java.awt.Color color) {
		this.color = color;
	}

	
}
