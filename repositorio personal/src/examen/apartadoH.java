package examen;

import javax.swing.JOptionPane;

public class apartadoH {

	public static void main(String[] args) {

		// Declaramos las variables
		int array[] = new int[10];
		int num;
		int i;

		// Le pedimos al usuario que nos introduzca 10 numeros
		for (i = 0; i < 10; i++) {
			String str = JOptionPane.showInputDialog("Introduzca 10 numeros");
			num = Integer.parseInt(str);

			array[i] = num;

		}

		// Imprimir en la consola el array creado
		for (i = 0; i < array.length; i++) {

			System.out.print(array[i] + "    ");
		}

		// EL algoritmo de ordenacion empleado es el metodo burbuja
		// Utilizamos dos bucles
		for (i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1; j++) {
				// Utilizamos una estructura condicional en la que decimos
				// que si un valor del array es mayor que el siguiente
				if (array[j] > array[j + 1]) {
					// Realice un cambio
					int aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;

					// En el metodo burbuja se repite todo el rato este procedimiento
					// Va comparando de dos en dos cada uno de los valores del array
					// Así hasta que esté ordenado
				}
			}
		}
		// Realizamos un salto de linea
		System.out.println();
		// Añadimos un comentario
		System.out.print("El array ordenado es:");
		System.out.println();
		// Imprimimos el valor del array comentado
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}

	}
}
