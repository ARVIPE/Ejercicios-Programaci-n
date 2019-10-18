package tema5.bloque2;


public class ejercicio2 {

    public static void main(String[] args) {
 
        int array2[] = new int[5];
        int array[] = new int[5];
        int array3[] = new int [5];

		// Inicializamos el contenido del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (5));
		}
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
		System.out.println("");   

		// Inicializamos el contenido del array
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) Math.round(Math.random() * (5));
		}
		
		System.out.println("");
		
		// Imprimir en la consola el array creado
		for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
		
		System.out.println("");
    
        for (int i = 0; i < array3.length; i++) {

        if (array[i] % 2 != 0) {
                array3[i] = array[i];
        }
            if (array[i] % 2 == 0) {
            array3[i] = array2[i];
                
    
            System.out.print(array3[i]);   
            }
        }
    }
}

    

  


    