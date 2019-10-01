import javax.swing.JOptionPane;

public class ejercicio2tema2bloquedeejercicios2 {

	public static void main(String[] args) {
		
		int acumNegativos = 0; // < 0;
		int acumBajos = 0; // >= 0 y < 15
		int acumMedios = 0; // >= 25 y < 250
		int acumAltos = 0; // >= 250str = JOptionPane.showInputDialog("Introduzca un número del 0 incluido al 25");
		int acBajos = Integer.parseInt(str);
		
		String str = JOptionPane.showInputDialog("Introduzca el primer número");
		int num = Integer.parseInt(str);
		
		if (num < 0) { // Si es negativo lo acumulo correctamente
			acumNegativos = acumNegativos + num; // Se puede resumir como acumNegativos += num;
		}
		else {
			if (num < 25) {
				acumBajos += num;
			}
			else {
				if (num < 250) {
					acumMedios += num;
				}
				else {
					acumAltos += num;
				}
			}
			
		}
		str = JOptionPane.showInputDialog("Introduzca el primer número");
		int num1 = Integer.parseInt(str);
		
		if (num < 0) { // Si es negativo lo acumulo correctamente
			acumNegativos = acumNegativos + num1; // Se puede resumir como acumNegativos += num;
		}
		else {
			if (num < 25) {
				acumBajos += num;
			}
			else {
				if (num < 250) {
					acumMedios += num;
				}
				else {
					acumAltos += num;
				}
			}
			
		}
		str = JOptionPane.showInputDialog("Introduzca el primer número");
		int num2 = Integer.parseInt(str);
		
		if (num < 0) { // Si es negativo lo acumulo correctamente
			acumNegativos = acumNegativos + num2; // Se puede resumir como acumNegativos += num;
		}
		else {
			if (num < 25) {
				acumBajos += num;
			}
			else {
				if (num < 250) {
					acumMedios += num;
				}
				else {
					acumAltos += num;
				}
			}
			
		}
		str = JOptionPane.showInputDialog("Introduzca el primer número");
		int num = Integer.parseInt(str);
		
		if (num < 0) { // Si es negativo lo acumulo correctamente
			acumNegativos = acumNegativos + num; // Se puede resumir como acumNegativos += num;
		}
		else {
			if (num < 25) {
				acumBajos += num;
			}
			else {
				if (num < 250) {
					acumMedios += num;
				}
				else {
					acumAltos += num;
				}
			}
			
		}
		str = JOptionPane.showInputDialog("Introduzca el primer número");
		int num = Integer.parseInt(str);
		
		if (num < 0) { // Si es negativo lo acumulo correctamente
			acumNegativos = acumNegativos + num; // Se puede resumir como acumNegativos += num;
		}
		else {
			if (num < 25) {
				acumBajos += num;
			}
			else {
				if (num < 250) {
					acumMedios += num;
				}
				else {
					acumAltos += num;
				}
			}
			
		}
		
		
	}
}
