package tema5.bloque2;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		
		int numeros[] = new int[150];
		int resultado = 0;
		
		String str = JOptionPane.showInputDialog("Introduzca el número por cual quiera multiplicar el array");
		int multiplicar = Integer.parseInt(str);
		
		System.out.println("El array es:");
		System.out.println();
		
		// Inicializamos el contenido del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100));
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		System.out.println("El array multiplicado");
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
		
		resultado = numeros[i] * multiplicar;
		System.out.println(resultado);
		}
	}
}
		
	
