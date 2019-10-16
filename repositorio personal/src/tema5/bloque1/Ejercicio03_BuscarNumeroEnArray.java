package tema5.bloque1;
import javax.swing.JOptionPane;

public class Ejercicio03_BuscarNumeroEnArray {

	public static void main(String[] args) {
		int numeroBuscado;
		// Declaraci�n de array
		int array[] = new int[250];
		
		// Inicializamos el array
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerNumeroAleatorio(-100, 100);
		}
		
		// Mostramos el array 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		// Pedir n�mero al usuario
		numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero"));

		// Una l�nea en blanco
		System.out.println();
		
		boolean estaNumeroBuscadoEnArray = false;
		// Buscar el n�mero del usuario
		for (int i = 0; i < array.length && !estaNumeroBuscadoEnArray; i++) {
			if (numeroBuscado == array[i]) {
				System.out.println("He encontrado el n�mero " + numeroBuscado + 
						" en posici�n " + i);
				estaNumeroBuscadoEnArray = true;
			}
		}

		// Si el contador est� a cero, despu�s de haber recorrido el array,
		// sabemos que el n�mero buscado no est� en el mismo
		if (!estaNumeroBuscadoEnArray) {
			System.out.println("El n�mero " + numeroBuscado + " no se encuentra");
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
