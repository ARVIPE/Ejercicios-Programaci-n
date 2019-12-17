package formula1Juego;

public class Vehiculo {
	
	private String nombre;
	private int posicion;
	private String color;
	private Pista p = new Pista();
	
	public Vehiculo(String nombre, int posicion, String color) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.color = color;
	}
	/**
	 * 
	 */
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the posicion
	 */
	public int getPosicion() {
		return posicion;
	}
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", posicion=" + posicion + ", color=" + color + "]";
	}
	
	

}
