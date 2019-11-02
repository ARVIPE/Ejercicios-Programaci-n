package tema5.bloque4;

public class ejercicio3 {

	public static void main(String[] args) {
		
		
		 int parteentera[] = new int[10];
		
		 
		
		for (int i = 0; i < parteentera.length; i++) {
			parteentera[i] = (int) Math.round(Math.random() * (100));
		}
        
        System.out.println("El array es:");
        
		// Imprimir en la consola el array creado
		for (int i = 0; i < parteentera.length; i++) {

			System.out.print("      " + parteentera[i]);
		}
        
		
			System.out.println();

		
			for (int i = 0; i < 11; i++) {
				String partedecimal = ((Math.random()) + "      ");

				System.out.print(partedecimal + "      ");
			}
			double partedecimal = 0;
			for (int i = 0; i < 10; i++) {

				double numerostotales = parteentera[i] + partedecimal;
			}
			String numerostotales;
			System.out.print(numerostotales + "    ");
		


		}
		
		

		
    		
		
		

	}

}
