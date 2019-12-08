package tema4.practicaexamen1;

public class Humano {
	
	private int puntosVida;
	private String nombre;
	private boolean vivo;
	
	public Humano(int puntosVida, String nombre, boolean vivo) {
		super();
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.vivo = vivo;
	}

	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

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
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	@Override
	public String toString() {
		return "Humano [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}


}
