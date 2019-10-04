package tema2;

import javax.swing.JOptionPane;

public class ejercicio4bloquedeejercicios3 {

	public static void main(String[] args) {

        String str = JOptionPane.showInputDialog("Introduzca el importe de la compra");
        int importe = Integer.parseInt(str);

        str = JOptionPane.showInputDialog("Introduzca la cantidad pagada");
        int pagado = Integer.parseInt(str);

        int vuelta = (pagado - importe);
	
        System.out.println("Devuelvo" + (vuelta  / 10000) + " billetes de 100");
        vuelta = vuelta % 10000;

 
        System.out.println("Devuelvo" + (vuelta  / 5000) + " billetes de 50");
        vuelta = vuelta % 5000;
        
        System.out.println("Devuelvo" + (vuelta  / 2000) + " billetes de 20");
        vuelta = vuelta % 2000;
        
        System.out.println("Devuelvo" + (vuelta  / 1000) + " billetes de 10");
        vuelta = vuelta % 1000;
        
        System.out.println("Devuelvo" + (vuelta  / 500) + " billetes de 5");
        vuelta = vuelta % 500;
        
        System.out.println("Devuelvo" + (vuelta  / 500) + " billetes de 1");
        vuelta = vuelta % 100;
        
        
        
           

    }
} 