package tema4.ejercicio_TiendaAntigüedades;


public abstract class Antiguedad {
	
	protected  Antiguedad joya;
	protected  Antiguedad libro;
	protected int anioFabricacion;
	protected String origen;
	protected float precioVenta;
	
	public Antiguedad() {
		
	}
	/**
	 * @param anioFabricacion
	 * @param origen
	 * @param precioVenta
	 */
	
	public Antiguedad(int anioFabricacion, String origen, float precioVenta) {
		super();
		this.anioFabricacion = anioFabricacion;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}
	/**
	 * 
	 */
	public Antiguedad (Antiguedad joya, Antiguedad libro) {
		super();
		this.joya = joya;
		this.libro = libro;
		
	}
	/**
	 * @return the anioFabricacion
	 */
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	/**
	 * @param anioFabricacion the anioFabricacion to set
	 */
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}
	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	/**
	 * @return the precioVenta
	 */
	public float getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		return "Antiguedades [anioFabricacion=" + anioFabricacion + ", origen=" + origen + ", precioVenta="
				+ precioVenta + "]";
	}
	

}