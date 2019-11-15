package examen;

public class apartadoC {

	public static void main(String[] args) {

		// Indicamos la longitud del array
		int array[] = new int[100];
		int i;
		int suma = 0;
		int pordebajodelamedia = 0;

		// Inicializamos en array
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - (-100)) + 100);
		}

		// Imprimimos en pantalla el valor del array
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		// Salto de linea
		System.out.println();

		// Realizamos la suma de todos los valores del array
		for (i = 1; i < array.length; i++) {
			suma = suma + array[i];
		}

		// A partir de la suma, tenemos que dividir esta por la longitud de nuestro
		// array para poder calcular la media
		float media = suma / array.length;

		// Imprimimos nuestra media en pantalla
		System.out.print("La media es: " + media);

		System.out.println();

		// Añadimos un comentario
		System.out.print("Los numeros que estan por debajo de la media son: ");

		System.out.println();

		// Expresamos un condicional que compruebe todos los numeros del array que se
		// encuentran por debajo
		// de nuestra media calculada anteriormente
		for (i = 0; i < array.length; i++) {
			if (array[i] < media) {
				// Añadimos un contador para que vaya contando todos los numeros por debajo de
				// la media
				pordebajodelamedia++;

				// Imprimimos todos esos numeros
				System.out.print(array[i] + "  ");

			}
		}
		// Salto de linea
		System.out.println();

		// Calculamos la media y la imprimimos en pantalla
		System.out.print(
				"Hay un: " + ((pordebajodelamedia * 100) / array.length) + "% de numeros por debajo de la media");

	}

}
