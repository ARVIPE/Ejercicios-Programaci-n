package practicaexamen.OpcionB;

import javax.swing.JOptionPane;

public class apartadoB_OpcionB {
	
	public static void main(String[] args) {
		
		//Le pedimos al usuario un n�mero
		String str = JOptionPane.showInputDialog("Introduce un n�mero");
		int numeros = Integer.parseInt(str);
		
		//Le imponemos la condici�n para que el n�mero sea primo
		if(numeros % 2 == 0) {
			System.out.println("El n�mero es primo");
		}else{
			System.out.println("El n�mero es impar");
		}
		
		
	}

}
