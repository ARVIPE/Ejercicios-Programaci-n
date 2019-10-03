package tema2;

import javax.swing.JOptionPane;

public class ejercicio4bloquedeejercicios3 {

	public static void main(String[] args) {

        String str = JOptionPane.showInputDialog("Introduzca el importe de la compra");
        int importe = Integer.parseInt(str);

        str = JOptionPane.showInputDialog("Introduzca la cantidad pagada");
        int pagado = Integer.parseInt(str);

       int vuelta = (pagado - importe);
       System.out.println(vuelta);

       System.out.println(vuelta/100 + " monedas de 100 " + vuelta/50 + " monedas de 50 " + vuelta/25 + " monedas de 25 "+ vuelta/5 + " monedas de 5 " + vuelta/1 + " monedas de 1 ");
        
        if (vuelta % 100) == 0 {
            System.out.println("La vuelta es" + vuelta/100);
        }


    }
} 