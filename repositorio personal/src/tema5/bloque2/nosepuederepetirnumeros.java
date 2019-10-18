package tema5.bloque2;

public class nosepuederepetirnumeros {

	public static void main(String[] args) {

        int array[] = new int[5];
     

        // Inicializamos el contenido del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100));
		}
		
		// Imprimir en la consola el array creado
			for (int i = 0; i < array.length; i++) {
		
			if (array [i] == array[i]) {
				array[i] = (int) Math.round(Math.random() * (100));
			}else {
				array[i] = array [i];
				System.out.println(array[i]);
			}
		}
	}
}
		
	
				
				
			
			
		     


        
        


