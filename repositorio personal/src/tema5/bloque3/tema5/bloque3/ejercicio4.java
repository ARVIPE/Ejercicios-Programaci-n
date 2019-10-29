package tema5.bloque3;


public class ejercicio4 {

	public static void main(String[] args) {

		int array[] = new int [20];
		int i;
		int j = 0;
		
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20));    
		}
	
		// Imprimir en la consola el array creado
		for (i = 0; i < array.length; i++) {
			
		

			System.out.print(array[i] + "    ");
		}

		for (i = 0; i < array.length - 1; i++){
			
			int minimo = i;
			
			for(j = i + 1; j < array.length; j++){

				
				if (array[j] < array[minimo]){
					minimo = j;
					}
				}
				int aux = array[i];
				array[i] = array[minimo];
				array[minimo] = aux;
			}
		
		
		System.out.println();

		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}
	}
}




	

		
