package tema3;

import javax.swing.JOptionPane;

public class ejercicio2bloque2 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Illo cuantos números quieres meter compadre");
		int numero = Integer.parseInt(str);

		

		for(int i=0; i < numero; i++) {

			String srt = JOptionPane.showInputDialog("Introduce la sucesión de números");
			int sucesiondenumeros = Integer.parseInt(str);

			if (sucesiondenumeros > sucesiondenumeros) {
				System.out.println(sucesiondenumeros);

			}else{
				System.out.println(sucesiondenumeros);
			}


		
			System.out.println("Illo tu número menor es:" + sucesiondenumeros);
		
		}
		
	}
}
