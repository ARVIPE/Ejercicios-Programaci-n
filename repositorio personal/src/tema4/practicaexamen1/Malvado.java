package tema4.practicaexamen1;

public class Malvado {
	
	private int puntosVida;
	private String nombre;
	private boolean vivo;
	
	public Malvado(int puntosVida, String nombre, boolean vivo) {
		super();
		this.puntosVida = puntosVida;
		this.nombre = nombre;
		this.vivo = vivo;
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
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	@Override
	public String toString() {
		return "Malvado [puntosVida=" + puntosVida + ", nombre=" + nombre + ", vivo=" + vivo + ", getPuntosVida()="
				+ getPuntosVida() + ", getNombre()=" + getNombre() + ", isVivo()=" + isVivo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}
