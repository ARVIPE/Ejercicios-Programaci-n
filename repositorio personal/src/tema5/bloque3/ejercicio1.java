package tema5.bloque3;


public class ejercicio1 {

	public static void main(String[] args) {
		// Declaraci�n del array
		int array[] = new int[20];
		
		for (int i = 0; i < array.length; i++) {

			int candidato; 
			boolean existeCandidatoEnArray;  
		
			do {
				candidato = Utils.obtenerNumeroAzar1(20);
				existeCandidatoEnArray = false;
				for (int j = 0; j < i; j++) {
					if (array[j] == candidato) {
						existeCandidatoEnArray = true;
					}
				}
			} while (existeCandidatoEnArray);
	
			array[i] = candidato;
		}
		
	
		System.out.println(array);
	}

}

	