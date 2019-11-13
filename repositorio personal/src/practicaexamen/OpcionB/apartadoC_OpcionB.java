package practicaexamen.OpcionB;

public class apartadoC_OpcionB {

	public static void main(String[] args) {
		
		int array[] = new int[20];
		
		//Inicializamos el contenido del array
		for (int i = 0; i < array.length; i++) {
	          
	 		array[i] = (i + 1);
        //Imprimimos el valor del array

	 		for(i = 2; i < array-1; i++) {
				if(array%i==0) { 
					System.out.println("El numero no es primo");
					return;
				}
			}
	 		System.out.println(array[i]);
                
        }
      

	}

}
