package tema5.bloque3;


public class ejercicio3 {

	public static void main(String[] args) {

		int array[] = new int [20];
		int i;
        int j = 0;
        int salto;
        int k;
		
		
		for (i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20));    
		}
	
		// Imprimir en la consola el array creado
		for (i = 0; i < array.length; i++) {
			


			System.out.print(array[i] + "    ");
        }
        
        salto = array.length/2;

        for (j = 0; j < array.length - 1; j++) {
        	
        	k=j+salto;
        	
        	for (j = 0; j < array.length; j++) {
				          	
            	if(array[j] <= array[k]){
            		j = -1;
            	}else{
            		int aux = array[j];
            		array[j] = array[k];
            		array[k] = aux;
            		j = j - salto;
            	}
        	}

            	
        }
    


        salto = salto/2;
        for (i = 0; i < array.length; i++) {
			System.out.print(array[j] + "    ");
		}


    }
}
