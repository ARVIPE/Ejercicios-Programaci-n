package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class Ejercicio04_MenorNumerosHastaUsuarioDecidabuclewhile {

	public static void main(String[] args) {
		int menor = 0, num = -1;
		int contador = 0;

		
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca n�mero (0 -> Salir): "));
			contador++;
			
					if (contador == 1) {
				menor = num;
			}
			else {
				if (num < menor && num != 0) {
					menor = num;
				}
			}
		}
		
		// Sacamos el mensaje final con el valor acumulado
		JOptionPane.showMessageDialog(null, "Menor total " + menor); 
	}
	
	

}
