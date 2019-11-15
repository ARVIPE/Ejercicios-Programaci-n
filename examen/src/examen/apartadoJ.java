package examen;

public class apartadoJ {

	public static void main(String[] args) {

		// Declaramos el array asi como la longitud de este
		int array[] = new int[100];
		int i;

		// Inicializamos en array
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000);
		}

		// Realizamos un salto de linea
		System.out.println();

		// Imprimimos el valor del array
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

		System.out.println();


		for (i = 0; i < array.length; i++) {

			if (array[i] > array[i + 1]) {
				
				System.out.print("false");
				System.out.println();
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
			} else {
				if (array[i] < array[i + 1]) {
					System.out.println();
				
					System.out.print("true");
				}
			}
		}
		//Mostramos el array
		System.out.println();
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}

		System.out.println();

		for (i = 0; i < array.length; i++) {

			if (array[i] < array[i + 1]) {
			
				System.out.print("true");
				for (i = 0; i < array.length - 1; i++) {

					for (i = 0; i < array.length - 1; i++) {

						if (array[i] > array[i + 1]) {
						
							System.out.print("false");
						}
					}
				}
			}
		}
	}
}
