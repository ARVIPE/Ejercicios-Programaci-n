package formula1Juego;

public abstract class Vehiculo {
	
	private String nombre;
	private int posicion;
	private String color;
	private Pista p;
	
	public Vehiculo(String nombre) {
		super();
		this.nombre = nombre;
		this.posicion = 0;
		this.p = new Pista();
	
	}
	
	public void mover() {
		this.posicion += Math.round(Math.random() * (6 - 1) + 1);
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Pista getP() {
		return p;
	}

	public void setP(Pista p) {
		this.p = p;
	}

	public abstract void caerEnUnObstaculo();


}
