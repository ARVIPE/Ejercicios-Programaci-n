package tema3;

import javax.swing.JOptionPane;

public class ejercicio3bloque2 {

	public static void main(String[] args) {
        
        String str = JOptionPane.showInputDialog("Introduzca el número del que quiera conocer sus múltiplos");
        int numero = Integer.parseInt(str);
        
        int limite = 100;
        int factor = numero;
            
            
        for (int i = 0; (i * factor) < limite; i++) {
            System.out.println("Valor de i * factor: " + (i * factor));
        }
    }
}
