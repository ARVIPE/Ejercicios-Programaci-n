package tema3.ejerciciosbloque3;

import javax.swing.JOptionPane;

public class Ejercicio05_MenorYMenorNumerosHastaUsuarioDecidabucledowhile {

	public static void main(String[] args) {
		int menor = 0, mayor = 0, num = -1;
		int contador = 0;
		
		do{
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
		}while (num != 0);
		
		// Sacamos el mensaje final con el valor acumulado
		JOptionPane.showMessageDialog(null, "Mayor " + mayor + 
				" y menor " + menor); 
	}
	
	

}
