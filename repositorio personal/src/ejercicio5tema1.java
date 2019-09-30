import javax.swing.JOptionPane;

public class ejercicio5tema1 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un n�mero:");
		int a = Integer.parseInt(str);
		System.out.println("N�mero introducido:" + a);
		
		str = JOptionPane.showInputDialog("Introduzca el segundo n�mero:");
		int b = Integer.parseInt(str);
		System.out.println("N�mero introducido:" + b);
		
		int AUX;
		AUX = a; //AUX es un comando para cambiar los numeros de orden
		a = b;
		b = AUX;
		System.out.println("a = " + a + "," + "b = " + b);
		
		

	}

}
