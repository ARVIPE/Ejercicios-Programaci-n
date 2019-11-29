package tema4.ejercicio_TiendaAntigüedades;

import tema4.ejercicio_bloque03_ejercicio06.Plato;

public class Antiguedad {

	private int año_fabricacion;
	private String origen;
	private int precio_venta;

	public Antiguedad(int año_fabricacion, String origen, int precio_venta) {
		this.año_fabricacion = año_fabricacion;
		this.origen = origen;
		this.precio_venta = precio_venta;
	}

	public void imprimir() {
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print("El año de fabricación es: " + año_fabricacion + "   " + "El origen es: " + origen
						+ "   " + "El precio es: " + precio_venta + " euros");
			}

		}
	}
	public Antiguedad getjoya(){
		return joya;
	}

	public Antiguedad getlibro(){
		return libro;
	}

}