package tema4.ejercicio_TiendaAntigüedades;

import tema4.ejercicio_bloque03_ejercicio06.Plato;

public class Antiguedad {

	private String origen;
	private int precio_venta;
	private String nombre;
	private int anyo;
	private int precio;

	public Antiguedad(String nombre,int anyo, String origen, int precio) {
		this.nombre = nombre;
		this.anyo = anyo;
		this.origen = origen;
		this.precio = precio;
	}

	public void imprimir() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("El año de fabricación es: " + anyo + "   " + "El origen es: " + origen
						+ "   " + "El precio es: " + precio_venta + " euros");
			}

		}
	}
	public String nombre() {
		return nombre;
	}
	
	//String y luego los geters y los seters
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public int getanyo(){
		return anyo;public void setnombre(String nombre) {
			this.nombre = nombre;
		}
	}
	
	public void setanyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	public String getorigen(){
		return origen;
	}
	
	public void setorigen(String origen) {
		this.origen = origen;
	}
	
	public int getprecio(int precio) {
		return precio;
	}
	
	public void setprecio() {
		this.precio = precio;
	}
	

}