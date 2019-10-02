package tema2;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		
		String str= JOptionPane.showInputDialog("Introduzca el primer n�mero:");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo n�mero:");
		int b = Integer.parseInt(str);
		
		if (a>b) {
			System.out.println("El n�mero mayor es: " + a);
		
		}else {
			System.out.println("El n�mero mayor es: " + b);
		}
		

	}

}
