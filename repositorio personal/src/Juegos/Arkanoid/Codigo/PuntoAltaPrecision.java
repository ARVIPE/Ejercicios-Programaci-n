package Juegos.Arkanoid.Codigo;

/**
 * Clase interna que nos aporta precisión en el cálculo de la coordenada que ocupa la bola
 * @author R
 *
 */
public class PuntoAltaPrecision {
	// En lugar de utilizar valores enteros para determinar la coordenada, utilizamos flotantes
	public float vx;
	public float vy;
	
	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	public PuntoAltaPrecision (float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}

	/**
	 * Típico toString()
	 */
	@Override
	public String toString() {
		return "PuntoAltaPrecision [x=" + vx + ", y=" + vy + "]";
	}
}