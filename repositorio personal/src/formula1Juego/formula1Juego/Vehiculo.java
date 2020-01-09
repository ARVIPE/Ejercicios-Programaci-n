package formula1Juego.formula1Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
	
	private String nombre;
	private int posicion;
	private Color color;
	private Pista pista;
	private int numeroDePista;
	private int distanciaDeLaPista;
	public List <Integer> tacometro  = new ArrayList <Integer>();
	
	public Vehiculo(String nombre, int numeroDePista, Color color) {
		super();
		this.nombre = nombre;
		this.posicion = 0;
		this.color = color;
		this.numeroDePista = numeroDePista;
		this.pista = new Pista(distanciaDeLaPista);
		//Ejecutamos el metodo que nos construye nuestra pista
		pintarPista();
		

	}
	
	
	public boolean tirada() {
		boolean tirada = true;
		if(posicion < Pista.getLongitud()) {
			this.posicion += (int) Math.round(Math.random() * (6 - 1) + 1);	
		for (int i = 0; i < pista.getObstaculos().size(); i++) {
			if (pista.getObstaculos().get(i).getPosicionObstaculo() == this.posicion) {
				this.posicion += pista.getObstaculos().get(i).getImpulso();
				System.out.println(this.nombre +  " ha caido en un obstaculo: " + pista.getObstaculos().get(i).getNombre());
				if(pista.getObstaculos().get(i).getImpulso() < 0) {
					SoundRepository.getInstance().playSound(SoundRepository.MUSICA_DERRAPE);
				}
				else {
					SoundRepository.getInstance().playSound(SoundRepository.MUSICA_IMPULSO);
				}
			}
		}	this.tacometro.add(this.posicion); 
		}else {
			tirada = false;
			System.out.println("Ha llegado a la meta: " + this.nombre);
		}
		return tirada;

	}
	
	 
		public void imprimirTacometro () {
			System.out.println(tacometro.toString());
		}

	
	//Tenemos que construir cada una de las cuatro pistas estas son
	//el numero de cada pista * 400 que es el alto de nuestra ventana entre 4
	//ya que tenemos cuatro pistas
	public int pintarPista() {
		return distanciaDeLaPista = (numeroDePista*400/4);
	}
	
	
	//Creamos metodos abstractos para pintar los vehiculos
	protected abstract void paint(Graphics g);
	public abstract void pintarVehiculo(Graphics g);

	@Override
	public String toString() {
		return "Vehiculos [nombre=" + nombre + ", posicion=" + posicion + ", color=" + color + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Pista getPista() {
		return pista;
	}


	public void setPista(Pista pista) {
		this.pista = pista;
	}


	public int getNumeroDePista() {
		return numeroDePista;
	}


	public void setNumeroDePista(int numeroDePista) {
		this.numeroDePista = numeroDePista;
	}


	public int getDistanciaDeLaPista() {
		return distanciaDeLaPista;
	}


	public void setDistanciaDeLaPista(int distanciaDeLaPista) {
		this.distanciaDeLaPista = distanciaDeLaPista;
	}

	




}
