package tema3;

import javax.swing.JOptionPane;

public class ejercicio2bloque1 {

	public static void main(String[] args) {
		
		int i;
		int suma = 0;

		String str = JOptionPane.showInputDialog("¿Cuántos numeros quiere que le pidan?");
		int cuantosnumeros = Integer.parseInt(str);
			

		for (i = 0; i < cuantosnumeros; i++) {
			str = JOptionPane.showInputDialog("Introduzca " + + cuantosnumeros + " números ");
			int numeros = Integer.parseInt(str);
			
		
			if (numeros > 10) {
				suma = suma + numeros;
				System.out.println(suma);
	
					
			}else{
				System.out.println("Este numero no es mayor que 10");
			}
		}
	}
}
		
		
		
			
		
				
			
		
	
	
