package tema3;

import javax.swing.JOptionPane;

public class ejercicio1bloque1 {

	public static void main(String[] args) {
		
			int i;
		
			for (i = 0; i < 4; i++) {
				String str = JOptionPane.showInputDialog("Introduzca 4 números");
				int numeros = Integer.parseInt(str);
			
		
				if (numeros > 10) {
					int suma = numeros;
					System.out.println(suma);
	
					
				}else{
					System.out.println("No hay suma");
		
		
		
		
			
		
				}
		}
	}

}
