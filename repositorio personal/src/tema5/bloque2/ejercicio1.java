package tema5.bloque2;


public class ejercicio1 {

	public static void main(String[] args) {
		

		int numeros[] = new int[150];
		
		int numerosPositivos = 0;
		int numerosNegativos = 0;
		

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - -100) + -100);
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println();
			
			for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] <= 0) {
			 numerosPositivos = -numeros[i];
				System.out.println("Los números negativos cambiados de signo son: " + numerosPositivos);
			
			
				System.out.println();
			
				}else{
					if (numeros[i] >= 0) {
						numerosNegativos = -numeros[i];
						System.out.println("Los números positivos cambiados de signo son: " + numerosNegativos);
					}
				}
			}
	}
}
			
