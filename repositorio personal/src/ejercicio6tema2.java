import javax.swing.JOptionPane;

public class ejercicio6tema2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número:");
		int a = Integer.parseInt(str);
		
		if (a%2 == 0) {
			System.out.println("Compadre que el número es par illo");
		}else{
			System.out.println("Killo que el número es inpar");
		}
		

	}

}
