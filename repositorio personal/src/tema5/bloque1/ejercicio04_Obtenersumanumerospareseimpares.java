package tema5.bloque1;

public class ejercicio04_Obtenersumanumerospareseimpares {

	public static void main(String[] args) {

		int sumaInpares = 0;
		int sumaPares = 0;
		
		int numeros [] = new int[150];

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeroAleatorio();
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
		}
			for (int numero : numeros){
			
			if ((numero & 1) == 1) { //impar
				sumaInpares = sumaInpares + numero;
			}
			else {
				sumaPares = sumaPares + numero; 
			}
		}		
		
		System.out.println("La suma de los pares es: " + sumaPares);
		System.out.println("La suma de los inpares es: " + sumaInpares);
		
		
	}

	private static int numeroAleatorio() {
		return (int) Math.round(Math.random() * 100);
	}
}
			
				

	
		
	
	
	
