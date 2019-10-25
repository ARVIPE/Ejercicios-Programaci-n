package tema5.bloque3;


public class ejercicio2 {

	public static void main(String[] args) {

		int array[] = new int [20];
		int j;
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20));    
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {
			
		

			System.out.print(array[i] + "    ");
		}

		for (int i = 0; i < array.length; i++){
				int aux=array[i];
			for (j = i; j>0 && array[j-1] > aux; j--) {
				
				
			array[j] = array[j-1];
				
					
				
				
			}

		
			array[j] = aux;
	
 		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}

	}
}