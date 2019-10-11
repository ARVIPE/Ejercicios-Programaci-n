package tema3;

import javax.swing.JOptionPane;

public class ejercicio1bloque3bucledowhile {

	public static void main(String[] args) {
		
     
        int suma = 0;
        int numero = 1;
      

     
        do {
            
        	String str = JOptionPane.showInputDialog("Introduzca los números que desee");
            numero = Integer.parseInt(str);
       
       
        	
            
        	suma = suma + numero;
        	
       
        } while (numero != 0);
        	System.out.println(suma);


    }
			
}

