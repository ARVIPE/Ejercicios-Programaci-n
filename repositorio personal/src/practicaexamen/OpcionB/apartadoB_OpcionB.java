package practicaexamen.OpcionB;

import javax.swing.JOptionPane;

public class apartadoB_OpcionB {
	
	public static void main(String[] args) {
		
		//Le pedimos al usuario un número
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numeros = Integer.parseInt(str);
		
		//Le imponemos la condición para que el número sea primo
		if(numeros % 2 == 0) {
			System.out.println("El número es primo");
		}else{
			System.out.println("El número es impar");
		}
		
		
	}

}
