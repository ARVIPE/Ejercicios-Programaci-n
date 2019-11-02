package tema5.bloque4;

public class ejercicio2 {

	public static void main(String[] args) {

        int array[] = new int[5];
        
        int mediaaprobados = 0;
        int mediasuspensos = 0;
        int mediatotal = 0;

        for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (10));
		}
        
        System.out.println("El array es:");
        
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {

            System.out.print("      " + array[i]);
        }
		
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if ((i >= 5) && (array[i] >= 5)) {


			
				mediatotal = array[i] / i;
				
				
				System.out.println();
				System.out.println("La media de los aprobados es:  " + mediatotal);
			}
			
				
			
		}
		
		
	}
}
			

        
    