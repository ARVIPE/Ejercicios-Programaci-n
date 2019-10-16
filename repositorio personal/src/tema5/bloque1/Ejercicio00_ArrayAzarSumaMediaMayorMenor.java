package tema5.bloque1;
public class Ejercicio00_ArrayAzarSumaMediaMayorMenor {

	public static void main(String[] args) {
		// Declaraci�n de variables para el c�lculo del mayor, menor y suma
		int suma, mayor, menor;
		
		// Declaraci�n del array
		int array[] = new int[50000000];
		
		// Generaci�n de los n�meros al azar entre los l�mites
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}

		// Impresi�n en pantalla del array
//		System.out.println("Array generado con �xito");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + "  ");
//		}
		
		// C�lculo de los valores de mayor, menor y suma
		suma = array[0];
		mayor = array[0];
		menor = array[0];
		for (int i = 1; i < array.length; i++) {
			suma += array[i];
			// B�squeda del mayor y el menor
			// Lo hacemos con operadores ternarios por el simple hecho de usarlos
			// aunque no es lo m�s �ptimo que podemos hacer.
			mayor = (array[i] > mayor)? array[i] : mayor;
			menor = (array[i] < menor)? array[i] : menor;
		}
		
		// Impresi�n de los resultados
		System.out.println("\nMayor valor del array: " + mayor);
		System.out.println("Menor valor del array: " + menor);
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + ((float) suma / array.length));
	}

}
