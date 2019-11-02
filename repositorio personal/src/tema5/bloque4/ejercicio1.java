package tema5.bloque4;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		

        String str = JOptionPane.showInputDialog("Introduzca la longitud del array");
        int longitud = Integer.parseInt(str);


		int array[] = new int[longitud];
		
		

		// Inicializamos el contenido del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - -100) + -100);
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
        }

        if ((longitud % 3) == 0) {
            int posicionmedia = longitud/2;
        
        
        
        
            for (int i = 0; i < array.length; i++) {
			
                System.out.print(array[posicionmedia] + "");
            }
        }


    }
}
		