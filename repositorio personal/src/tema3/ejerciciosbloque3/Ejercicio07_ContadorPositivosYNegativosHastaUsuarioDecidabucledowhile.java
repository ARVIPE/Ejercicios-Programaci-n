package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class Ejercicio07_ContadorPositivosYNegativosHastaUsuarioDecidabucledowhile {

	public static void main(String[] args) {
		int num = -1, contPos = 0, contNeg = 0;

		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduzca n�mero (0 -> Salir): "));

			if (num < 0) { // Es negativo
				contNeg++;
			}
			if (num > 0) { // Es positivo
				contPos++;
			}
		}while (num!=0);
		
		// Impresi�n de los resultados
		JOptionPane.showMessageDialog(null, "Positivos " + contPos + 
				" y negativos " + contNeg);
	}
	
	

}
