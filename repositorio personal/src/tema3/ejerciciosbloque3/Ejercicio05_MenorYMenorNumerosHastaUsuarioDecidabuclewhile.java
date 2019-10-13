package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class Ejercicio05_MenorYMenorNumerosHastaUsuarioDecidabuclewhile {

	public static void main(String[] args) {
		int menor = 0, mayor = 0, num = -1;
		int contador = 0;
		
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca n�mero (0 -> Salir): "));
			contador ++;
					if (contador == 1) {
				menor = num;
				mayor = menor;
			}
			else {
				if (num < menor && num != 0) {
					menor = num;
				}
				if (num > mayor && num != 0) {
					mayor = num;
				}
			}
		}
		
		// Sacamos el mensaje final con el valor acumulado
		JOptionPane.showMessageDialog(null, "Mayor " + mayor + 
				" y menor " + menor); 
	}
	
	

}
