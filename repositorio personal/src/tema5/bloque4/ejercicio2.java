package tema5.bloque4;

public class ejercicio2 {

	public static void main(String[] args) {

        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (10));
		}
        
        System.out.println("El array es:");
        
		// Imprimir en la consola el array creado
		for (int i = 0; i < array.length; i++) {

            System.out.print("      " + array[i]);
        }


     
    }
}
        
    