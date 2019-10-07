package tema3;

import javax.swing.JOptionPane;

public class ejercicio1bloque2 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("¿Cuantos números quiere introducir?");
		int numeros = Integer.parseInt(str);
		
		int i;
		int media = 0;
		int suma = 0;

		
		
		for (i = 0; i < numeros; i++) {
			str = JOptionPane.showInputDialog("Introduzca los números");
			int serienumeros = Integer.parseInt(str);
			
			suma = suma + serienumeros;
			media = suma/numeros;
			
			
			
		}
			
		System.out.println(media);
			
			
	
		

	}

}
