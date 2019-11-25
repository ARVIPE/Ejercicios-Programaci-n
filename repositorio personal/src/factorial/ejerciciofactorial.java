package factorial;


import javax.swing.JOptionPane;

public class ejerciciofactorial {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduce el número");
		int numero = Integer.parseInt(str);
		
	
		
		int longitud = 1;
		do {
				
			longitud = longitud + 1;
			
			numero = numero / longitud;
		
			System.out.println(numero);
			
		
			
		}while(numero / longitud != 1);
		
		
		
		
		 
		
		
		
		
		

	}

}
