package formula1Juego;

public abstract class Vehiculo {
	
	private String nombre;
	private Pista p = new Pista();
	private int posicion;
	
	public Vehiculo(String nombre) {
		super();
		this.nombre = nombre;
		this.posicion = 0;
	
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

	public Pista getP() {
		return p;
	}

	public void setP(Pista p) {
		this.p = p;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Vehiculo [nombre = " + nombre + " posicion = " + posicion + "]";
	}

	public abstract void CaerEnObstaculo();
	
	

}
