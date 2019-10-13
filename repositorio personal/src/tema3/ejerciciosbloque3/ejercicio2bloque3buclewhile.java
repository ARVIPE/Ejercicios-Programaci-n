package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class ejercicio2bloque3buclewhile {

	public static void main(String[] args) {
		
		
         int numeros = 1;
         int contador = 0;
         int serienum = 0;
         int media = 0;
		
		    while(numeros != 0) {
                String str = JOptionPane.showInputDialog("Introduzca una serie de números");
                numeros = Integer.parseInt(str);
                
                serienum += numeros;
                contador = contador + 1;

 
                
            	if (numeros == 0) {
            		contador = contador - 1;
            		serienum += numeros;
            		
            		media = serienum/contador;
            	}
            	
            	
                
		    
        }
		    System.out.println(media);
    }
}
			
		
		
               