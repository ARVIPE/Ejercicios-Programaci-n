package tema3;

import javax.swing.JOptionPane;

public class ejercicio2bloque3 {

	public static void main(String[] args) {
		
		
         int numeros;
         int contador = 0;
         int serienum = 0;
		
		    do{
                String str = JOptionPane.showInputDialog("Introduzca una serie de números");
                numeros = Integer.parseInt(str);
                
                serienum += numeros;
                contador = contador + 1;

                


                

            } while(numeros!=0);

        if (numeros == 0) {
            contador = contador - 1;
        
        int media = serienum/contador;

        System.out.println(media);
        }
    }
}
			
		
               