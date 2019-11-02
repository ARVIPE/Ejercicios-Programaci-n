package tema5.bloque4;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		

        String str = JOptionPane.showInputDialog("Introduzca la longitud del array");
        int longitud = Integer.parseInt(str);


		int array[] = new int[longitud];
		
		

        // Inicializamos el contenido del arra
        
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - -100) + -100);
		}
        
        System.out.println("El array es:");
        
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {
            
           

            System.out.print("          " + array[i]);
        }
        System.out.println("       ");
        if ((longitud % 2) != 0) {
            int posicionmedia = longitud/2;
    
            System.out.println("El número que se encuentra en medio es: ");

        
                
                

             System.out.print(array[posicionmedia] + "      ");
            
        }else{
            System.out.println("El array es par");
        }


    }
}
		