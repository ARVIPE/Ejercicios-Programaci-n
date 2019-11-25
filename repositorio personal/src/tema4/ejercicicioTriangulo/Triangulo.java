package tema4.ejercicicioTriangulo;


public class Triangulo {
	
	
	private int base;
	private int altura;

	

    /**
     * @param base
     * @param altura
     * @return 
     */
	
	public void Triangulo(int altura) {
		this.altura = altura;
	}
	
	public void imprimir () {
		int contador = 1;
		for(int i = 0; i < this.altura; i++) {
			for(int j = 0; j < contador; j++) {
				System.out.print("*");
			}
			contador++;
			System.out.println();
		}
		
		
	}
	
}
