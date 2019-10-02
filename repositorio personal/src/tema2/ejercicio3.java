package tema2;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca el primer n�mero:");
		double a = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo n�mero:");
		double b = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog("Introduzca el tercer n�mero:");
		double c = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog("Introduzca el cuarto n�mero:");
		double d = Double.parseDouble(str);
		
		str = JOptionPane.showInputDialog("Introduzca el quinto n�mero:");
		double e = Double.parseDouble(str);
		
		if (a == b && a == c && a == d && a == e) {
			System.out.println("Los números son iguales");
		}
		
		if ((a > b) && (a > c) && (a > d) && (a > e)){
			System.out.println("El n�mero mayor es: " + a);
		}else
			if ((b > c) && (b > d) && (b > e)){
				System.out.println("El n�mero mayor es: " + b);
			}else
				if ((c > d) && (c > e)) {
					System.out.println("El n�mero mayor es: " + c);
				}else
					if (d > e) {
						System.out.println("El n�mero mayor es: " + d);
					}else{
						System.out.println("El n�mero mayor es:" + e);
					}
	}
}
	