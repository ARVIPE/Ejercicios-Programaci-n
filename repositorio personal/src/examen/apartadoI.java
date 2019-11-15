package examen;

import javax.swing.JOptionPane;

public class apartadoI {

	public static void main(String[] args) {
		int numeroBuscado;
		// Declaracion de array
		int array[] = new int[20];

		// Inicializamos el array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (10 - (-10)) + (-10));
		}

		// Mostramos el array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Pedir numero al usuario
		numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero"));

		// Una linea en blanco
		System.out.println();

		// Nos servimos de una variable boolean
		boolean estaNumeroBuscadoEnArray = false;
		// Buscamos el número del usuario
		for (int i = 0; i < array.length && !estaNumeroBuscadoEnArray; i++) {
			if (numeroBuscado == array[i]) {
				System.out.println("He encontrado el numero " + numeroBuscado + " en posicion " + i);
				estaNumeroBuscadoEnArray = true;
			}
		}

		// Si el contador está a cero, sabemos que el número
		// no está en el array
		// Hay que tener en cuenta tambien que parte de la posicion cero
		if (!estaNumeroBuscadoEnArray) {
			System.out.println("El numero " + numeroBuscado + " no se encuentra");
		}
	}
}
