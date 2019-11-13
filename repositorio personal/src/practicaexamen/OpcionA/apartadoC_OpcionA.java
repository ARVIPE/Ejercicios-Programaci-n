package practicaexamen.OpcionA;

public class apartadoC_OpcionA {
	
	
	public static void main(String[] args) {
		
		
		int array[] = new int[20];
		int i = 0;
		
		boolean esImpar = true;
		for(i = 0; i < array.length; i++) {
			
			do {
				int numero = (int) Math.round(Math.random() * (100 - 25) + 25);
				if (numero%2 == 0) {
					array[i] = numero;
					esImpar = false;
				}
				
			}while(esImpar);
			
		}
		
		for(i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
			
		
		
	
		
		
		
		
		
	}

}
