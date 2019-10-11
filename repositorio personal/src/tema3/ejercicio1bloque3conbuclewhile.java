package tema3;

import javax.swing.JOptionPane;

public class ejercicio1bloque3conbuclewhile {

	public static void main(String[] args) {
		
     
        int suma = 0;
        int numero = 1;
      

     
        while (numero != 0) {
            
        	String str = JOptionPane.showInputDialog("Introduzca los números que desee");
            numero = Integer.parseInt(str);
       
       
        	
            
        	suma = suma + numero;
        	
       
        }
        	System.out.println(suma);


    }
			
}

