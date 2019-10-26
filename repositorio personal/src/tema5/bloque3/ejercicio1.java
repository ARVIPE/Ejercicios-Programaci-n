package tema5.bloque3;


public class ejercicio1 {

	public static void main(String[] args) {

		int array[] = new int [20];
		
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20));    
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {
			
		

			System.out.print(array[i] + "    ");
		}

		for (int i = 0; i < array.length - 1  ; i++){

			for (int j = 0; j < array. length - 1; j++){
				if (array[j] > array[j+1]){
					
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					
				
				}
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}

	}
}