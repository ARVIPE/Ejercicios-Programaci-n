package tema3;

import javax.swing.JOptionPane;

public class ejercicio3bloque1 {

	public static void main(String[] args) {
		
		int i;
        int numerosmayor = 0;
        int numerosmenor = 0;

		String str = JOptionPane.showInputDialog("Introduzca cuantos numeros quiere que le pidan");
		int cuantosnumeros = Integer.parseInt(str);
			

		for (i = 0; i < cuantosnumeros; i++) {
			str = JOptionPane.showInputDialog(" Introduzca " + cuantosnumeros + " números ");
			int numeros = Integer.parseInt(str);
			
            
			if (numeros > 0) {
                numerosmayor = numerosmayor + 1;
	
					
			}else{
				numerosmenor = numerosmenor + 1;
            }
        }
        System.out.println(" Números mayor " + numerosmayor);
        System.out.println(" Números menor " + numerosmenor);
	}
}
		
		
		
			
		
		