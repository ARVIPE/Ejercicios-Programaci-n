import javax.swing.JOptionPane;

public class ejercicio1tema2 {

	public static void main(String[] args) {
		
		String str= JOptionPane.showInputDialog("Introduzca el primer número:");
		int a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo número:");
		int b = Integer.parseInt(str);
		
		if (a>b) {
			System.out.println("El número mayor es: " + a);
		
		}else {
			System.out.println("El número mayor es: " + b);
		}
		

	}

}
