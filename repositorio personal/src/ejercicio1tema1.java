import javax.swing.JOptionPane;

public class ejercicio1tema1 {

	public static void main(String[] args) {
	
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero");
		int a = Integer.parseInt(str);
		System.out.println("N�mero introducido:" + a);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero flotante"); //No hace falta introducir un string antes de str porque ya est� declarado
		float b = Float.parseFloat(str);
		System.out.println("N�mero introducido:" + b);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero doble");
		double c = Double.parseDouble(str);
		System.out.println("N�mero introducido" + c);
		
		double media = (a + b + c)/3; //importante no poner la media como int, ya que el resultado no tiene por qu� salir entero
		System.out.println("La media es:" + media);
		
		
		
	}

}
