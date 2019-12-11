package tema4.practicaexamenMarcianos;

public class Personaje {

	private int puntosVida;
	private String nombre;
	private static boolean vivo;

	public Personaje(String nombre) {
		super();
		this.puntosVida = (int) Math.round(Math.random() * (100 - 50) + 50);
		this.nombre = nombre;
		this.vivo = true;
	}

	// Creamos un metodo que sirve para doblar los puntos de vida
	public void doblarPuntosDeVida() {
		this.puntosVida = puntosVida * 2;
	}
	//Creamos un metado que sirva para disparar 
	public void disparar() {
		this.puntosVida = (int) (puntosVida - (Math.round(Math.random() * (25 - 5) + 5)));
		
		if(puntosVida <= 0) {
			this.vivo = false;
		}
	}
	

	public int getPuntosVida() {
		return puntosVida;
	}
	
	

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	

	public String getNombre() {
		return nombre;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public static boolean isVivo() {
		return vivo;
	}
	

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	

	@Override
	public String toString() {
		return "Personaje [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + "]";
	}
	
	

}
