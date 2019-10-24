package tema5.bloque2;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		
		int array[] = new int [5];
		
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int)Math.round(Math.random() * 10);
			System.out.print(array[i] + "     ");
		}
		
		System.out.println("");
		
		String str = JOptionPane.showInputDialog("Introduzca número de posiciones");
		int num = Integer.parseInt(str);

		for(int j = 0; j < num; j++){

		int aux=array[array.length-1];
		for (int i = array.length-1; i>0; i--) {
			array[i] = array[i-1];
			array[i-1] = aux;
		}
		
		System.out.println();

		array[0]=aux;
		
	
		}
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + "");
		}
	}
}

 
		
		

