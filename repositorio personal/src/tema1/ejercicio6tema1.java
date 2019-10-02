import javax.swing.JOptionPane;

public class ejercicio6tema1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca Euribor:");
		float Euribor = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca un diferencial:");
		float Diferencial = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca el capital:");
		float cptal = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca el n�mero de cuotas:");
		int Numerocuotas = (int) Float.parseFloat(str);
		
		float IA = Euribor + Diferencial;
		
		double cuotamensual = cptal*((IA*(1+ Math.pow(IA, Numerocuotas)))/2);
		
		System.out.println(cuotamensual);
		
		
		
	}

}
