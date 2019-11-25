package tema4.ejercicioRectangulo;

import tema4.ejercicio_bloque03_ejercicio06.Plato;

public class Rectangulo {
	
	
	private int base;
	private int altura;
	

    /**
     * @param base
     * @param altura
     */
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void imprimir () {
		for(int i = 0; i < this.altura; i++) {
			for(int j = 0; j < this.base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	

	
	

	
	
	
	

}
