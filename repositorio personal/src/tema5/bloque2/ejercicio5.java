package tema5.bloque2;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		
		int array[] = new int[5];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero de desplazamientos que desee:"));
		int aux = 0;
		int i;
		
		System.out.println();
		
		for (i = 0; i < num; i++) {
			aux=array[array.length-num];
		}
		
		for (i = array.length - num; i>0; i--) {
			array[i] = array[i-1];
			array[i-1]= aux;
		}
		
		array[0]=aux;
		
		System.out.println("");
		
		for( i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}



	



