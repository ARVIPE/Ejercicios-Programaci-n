package tema4.ejercicio3_bloque2Arbol;

public class hoja extends elementoArbol {
	
	private String color;
	
	public hoja() {
		
	}
	
	public hoja(String color) {
		super();
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "hoja [color=" + color + "]";
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
	
	
	
	
	
}
	