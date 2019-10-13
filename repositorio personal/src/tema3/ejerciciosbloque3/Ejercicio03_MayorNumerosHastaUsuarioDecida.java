package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class Ejercicio03_MayorNumerosHastaUsuarioDecida {

	public static void main(String[] args) {
		int mayor = 0, num = -1;

		
		for (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca n�mero (0 -> Salir): "));
			if (i == 0) {
				mayor = num;
			}
			else {
				if (num > mayor && num != 0) {
					mayor = num;
				}
			}
		}
		
		// Sacamos el mensaje final con el valor acumulado
		JOptionPane.showMessageDialog(null, "Mayor total " + mayor); 
	}
	
	

}
