package tema4.ejercicio3_bloque2Arbol;

public class frutos extends elementoArbol {


	
	private String nombre;
	
	public frutos() {
		
	}
	
	public frutos(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/**
	 * @return nombre
	 */
	public String getnombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the material to set
	 */
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "frutos [nombre=" + nombre + "]";
	}
	
	
	
}
	
	
	
