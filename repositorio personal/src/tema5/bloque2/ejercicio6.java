package tema5.bloque2;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {		
		int array[] = new int [5];
		
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int)Math.round(Math.random() * 100);
			System.out.println(array[i] + "");
		}
		
		System.out.println("");
		
        String str = JOptionPane.showInputDialog ("Introduzca el numero de posición");
        int posicion = Integer.parseInt(str);

        str = JOptionPane.showInputDialog("Indique si quiere ir a la derecha 0 o a izquierda 1");
        int direccion = Integer.parseInt(str);
        

        
            
        switch (direccion) {
        case 0:
            for (int i = 0; i < posicion; i++) {
                int aux = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j-1];
                    array[j - 1] = aux;
                }
                array[0] = aux;
                
                UtilsArrays.mostrarArray(array);
            }
            break;
        case 1:
            for (int j = 0; j < posicion; j++) {
                int aux = array[0];
                for (j = 0; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
                array[array.length-1] = aux;
               
                UtilsArrays.mostrarArray(array);
            
            }
            break;
        }
    }
}

            







    
    