package tema5.bloque1;

public class Ejercicio05_Sumacuyoindiceseapar {
	public static void main(String[] args) {
		int numeros[] = new int[150];
	

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeroAleatorio();
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			if (i%2 == 0) {
				int numerospares = numeros[i];
			}
		}
				
			
		
	}

	private static int numeroAleatorio() {

		return (int) Math.round(Math.random() * 100);
	}

}
