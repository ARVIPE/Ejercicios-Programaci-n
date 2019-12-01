package tema4.ejercicio_TiendaAntigüedades;

public class joya extends Antiguedad {
	
	private String material;
	
	public joya () {
		
	}

	public joya(int anioFabricacion, String origen, float precioVenta, String material) {
		super(anioFabricacion, origen, precioVenta);
		this.material = material;
		
	}
	


	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "Joyas [material=" + material + ", getAnioFabricacion()=" + getAnioFabricacion() + ", getOrigen()="
				+ getOrigen() + ", getPrecioVenta()=" + getPrecioVenta() + "]";
	}
	

}