package tema6.tema6Bloque4.tema6Bloque4Ejercicio1;

import javax.swing.JOptionPane;

public class EjercicioExcepcion {

	public static void pideNumeroPar() throws Excepcion {

		int num;

		String str = JOptionPane.showInputDialog("Introduzca número par:");
		num = Integer.parseInt(str);

		if ((num % 2) != 0) {
			throw new Excepcion("El número no es par");
		}

	}

	public static void main(String[] args) {
		try {
			pideNumeroPar();
		} catch (Excepcion e) {
			e.printStackTrace();
		}
	}

}