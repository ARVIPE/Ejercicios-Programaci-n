package tutorialJava.capitulo5_Arrays_y_Colecciones.ejercicios.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03_BuscarNumeroEnArray {

	public static void main(String[] args) {
		int numeroBuscado;
		// Declaración de array
		int array[] = new int[250];
		
		// Inicializamos el array
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerNumeroAleatorio(-100, 100);
		}
		
		// Mostramos el array 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		// Pedir número al usuario
		numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));

		// Una línea en blanco
		System.out.println();
		
		boolean estaNumeroBuscadoEnArray = false;
		// Buscar el número del usuario
		for (int i = 0; i < array.length && !estaNumeroBuscadoEnArray; i++) {
			if (numeroBuscado == array[i]) {
				System.out.println("He encontrado el número " + numeroBuscado + 
						" en posición " + i);
				estaNumeroBuscadoEnArray = true;
			}
		}

		// Si el contador está a cero, después de haber recorrido el array,
		// sabemos que el número buscado no está en el mismo
		if (!estaNumeroBuscadoEnArray) {
			System.out.println("El número " + numeroBuscado + " no se encuentra");
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	private static int obtenerNumeroAleatorio () {
		return (int) Math.round(Math.random() * 100);
	}

	/**
	 * 
	 * @return
	 */
	private static int obtenerNumeroAleatorio (int limiteInferior, int limiteSuperior) {
		return (int) Math.round(Math.random() * (limiteSuperior - limiteInferior) + limiteInferior);
	}

}
