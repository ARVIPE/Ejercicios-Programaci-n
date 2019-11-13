package practicaexamen.OpcionB;

public class apartadoC_OpcionB {

	public static void main(String[] args) {
		
		int array[] = new int[20];
		int i;
		
		//Inicializamos el contenido del array
		for (i = 0; i < array.length; i++) {
	          
		int numero = 0;
		boolean esPrimo;
		
		do {
				esPrimo = true;
				array[i] = (int) Math.round(Math.random() * 100);
				for(int j=2; i < numero-1; j++) {
					if (numero%j==0) {
						esPrimo = false;
					}
				}
			
			}while(!esPrimo);
		
			array[i]=numero;
		}
		
		for(i = 0; i < array.length; i++) {
		System.out.print(array[i]);
		}
		
	}
}
		
		
		
			

