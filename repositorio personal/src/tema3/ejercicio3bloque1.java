package tema3;

import javax.swing.JOptionPane;

public class ejercicio3bloque1 {

	public static void main(String[] args) {
        
        String str = JOptionPane.showInputDialog("Introduzca el número del que quiera saber los múltiplos");
        int numero = Integer.parseInt(str);

        int pares = numero%2;
        int impares = numero%3; 
        
        for (int i = 0; i > numero; i++){
            if  (pares ==  0) {
                System.out.println("Los multiplos son:" + numero);
            }else{
                if (impares == 0)
                System.out.println("Los multiplos son:" + numero);
            }
        }
    }
}



    
    
