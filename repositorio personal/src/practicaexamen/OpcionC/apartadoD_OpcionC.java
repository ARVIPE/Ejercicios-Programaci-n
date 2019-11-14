package practicaexamen.OpcionC;

import javax.swing.JOptionPane;

public class apartadoD_OpcionC {

	public static void main(String[] args) {

		String str = JOptionPane.showInputDialog("introduzca una cifra");
	    int numero = Integer.parseInt(str);
	        
		
        int array[] = new int[100];

        for(int i = 0; i < array.length; i++) {
        	array[i] = (int) Math.round(Math.random() * (100));
        }
        
        for(int i = 0; i < array.length-1; i++) {
        	System.out.print(array[i] + "   ");
        }
        
        System.out.println();
        
        for(int i = 0; i < array.length; i++) {
        	if (array[i] % 10 == numero) {
        		System.out.print("Los numeros son " + array[i]);
        		System.out.println();
        	}
        }
	}
}