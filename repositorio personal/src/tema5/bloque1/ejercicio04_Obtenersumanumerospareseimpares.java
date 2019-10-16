package tema5.bloque1;

public class ejercicio04_Obtenersumanumerospareseimpares {

	public static void main(String[] args) {
		
		
		int numeros [] = new int[150];

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeroAleatorio();
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		if (numeros[i]%2 == 0) {
			int pares = pares + 1; 
			System.out.println(pares);
			
		}else{
			int inpares = inpares + 1;
			System.out.println(inpares);
		}
		
		
		
		
	}

	private static int numeroAleatorio() {
		return (int) Math.round(Math.random() * 100);
	}
}
			
				

	
		
	
	
	
