package formula1Juego;

public class Obstaculo {
	
	private String nombre;
	private int posicionObstaculo;
	protected int impulso;


	public Obstaculo(String nombre) {
		super();
		this.posicionObstaculo = (int) Math.round(Math.random() * (100 - 1) + 1);
		this.nombre = nombre;
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

	
}
