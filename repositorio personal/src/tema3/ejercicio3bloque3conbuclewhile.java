package tema3;

import javax.swing.JOptionPane;

public class ejercicio3bloque3conbuclewhile {

	public static void main(String[] args) {
		int mayor = 0, num = -1;

		
		while (int i = 0; num != 0; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Introduzca número (0 -> Salir): "));
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
