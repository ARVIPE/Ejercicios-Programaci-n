package tema5.bloque3;


public class ejercicio3 {

	public static void main(String[] args) {

		int array[] = new int [20];

		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (20));    
		}
	
		// Imprimir en la consola el array creadoSystem.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}
		for (int i = 0; i < array.length; i++) {
			


			System.out.print(array[i] + "    ");
        }
        
		int salto, aux, i;

		boolean cambios;
		
		for(salto=array.length/2; salto!=0; salto = salto / 2){
		cambios=true;
			
			while(cambios){ 
			cambios=false;
			
				for(i=salto; i< array.length; i++) {
					if(array[i-salto]<array[i]){ 
						aux=array[i];
						array[i]=array[i-salto];
						array[i-salto]=aux;
						cambios=true;
					}
				}
			}
		}
		System.out.println();
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + "    ");
		}
	}
}
				

						
		
