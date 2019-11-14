package practicaexamen.OpcionA;

import javax.swing.JOptionPane;

public class apartadoB_OpcionA {

	public static void main(String[] args) {
		int limiteInferior, limiteSuperior;
		int numeros[] = new int[100];
		
		// Pedir limites al usuario
		limiteInferior = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el l�mite inferior"));
		limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el l�mite superior"));

		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (limiteSuperior - limiteInferior) + limiteInferior);
		}
		
		// Imprimir en la consola el array creado en orden normal
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		// Imprimir en la consola el array en orden invertido
		for (int i = numeros.length - 1; i > -1; i--) {
			System.out.print(numeros[i] + " ");
		}

		
	
		
	}

}
