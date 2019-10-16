package tema5.bloque1;

import javax.swing.JOptionPane;

public class Ejercicio01_NumeroEntreDosLimites {

	public static void main(String[] args) {
		int limiteInf, limiteSup;
		int numeros[] = new int[150];
		
		// Petici�n de l�mites al usuario
		limiteInf = Integer.parseInt(JOptionPane.showInputDialog("Introduzca l�mite inferior"));
		limiteSup = Integer.parseInt(JOptionPane.showInputDialog("Introduzca l�mite superior"));

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (limiteSup - limiteInf) + limiteInf);
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		// Imprimo un salto de l�nea
		System.out.println();
		
		// Otra forma de iterar sobre un array
		for (int num : numeros) {
			System.out.print(num + " ");
		}
	}

}
