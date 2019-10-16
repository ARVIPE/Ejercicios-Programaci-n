package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01;

public class Ejercicio00_ArrayAzarSumaMediaMayorMenor {

	public static void main(String[] args) {
		// Declaración de variables para el cálculo del mayor, menor y suma
		int suma, mayor, menor;
		
		// Declaración del array
		int array[] = new int[50000000];
		
		// Generación de los números al azar entre los límites
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Impresión en pantalla del array
//		System.out.println("Array generado con éxito");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + "  ");
//		}
		
		// Cálculo de los valores de mayor, menor y suma
		suma = array[0];
		mayor = array[0];
		menor = array[0];
		for (int i = 1; i < array.length; i++) {
			suma += array[i];
			// Búsqueda del mayor y el menor
			// Lo hacemos con operadores ternarios por el simple hecho de usarlos
			// aunque no es lo más óptimo que podemos hacer.
			mayor = (array[i] > mayor)? array[i] : mayor;
			menor = (array[i] < menor)? array[i] : menor;
		}
		
		// Impresión de los resultados
		System.out.println("\nMayor valor del array: " + mayor);
		System.out.println("Menor valor del array: " + menor);
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + ((float) suma / array.length));
	}

}
