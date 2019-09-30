import javax.swing.JOptionPane;

public class ejercicio6tema2opción2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número");
		int a = Integer.parseInt(str);
		
		int b = 1;
		int comparacion = a & b;
		
		if(comparacion == 1) {
			System.out.println("Impar");
		}else {
			System.out.println("Par");
		}
	

	}

}

