package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class Ejercicio04_MenorNumerosHastaUsuarioDecida {

	public static void main(String[] args) {
		int menor = 0, num = -1;

		
		for (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca n�mero (0 -> Salir): "));
			if (i == 0) {
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
