package practicaexamen.OpcionB;

import javax.swing.JOptionPane;

public class apartadoB_OpcionB {
	
	public static void main(String[] args) {
		
		//Le pedimos al usuario un número
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numeros = Integer.parseInt(str);
		
		//Empezamos a dividir desde 2 ya que sabemos que el numero 1 es divisor
		for(int i = 2; i < numeros-1; i++) {
			if(numeros%i==0) { 
				System.out.println("El numero no es primo");
				return;
			}
		}
		//El número es primo porque unicamente es divisible por si mismo y por la unidad
		System.out.println("El número es primo");
		
	}

}
