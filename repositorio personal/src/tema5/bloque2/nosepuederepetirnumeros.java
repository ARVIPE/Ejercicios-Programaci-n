package tema5.bloque2;

public class nosepuederepetirnumeros {

	public static void main(String[] args) {

		int array[] = new int[8];
		int array2[] = new int [1];
	
	
        // Inicializamos el contenido del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (10));
		}
		
		// Imprimir en la consola el array creado
			for (int i = 0; i < array.length; i++) {
		
			}
			
			
			
				for (int i = 0; i < array.length; i++) {
					if(array[i] == array[i]) {
						array2[i] = (int) Math.round(Math.random() * (10));
						array2[i] = array[i];
						System.out.println(array[i]);
					}
				}
				
			
	}
}
		
	
	
				
				
			
			
		     


        
        


