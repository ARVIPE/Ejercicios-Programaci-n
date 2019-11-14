package practicaexamen.OpcionA;

public class apartadoD_OpcionA {

	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		int i;
		for(i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100));
		}
		
		System.out.print(numeros[i]);
		
		int numeros2[] = new int[5];
		
		for(i = 0; i < numeros2.length; i++) {
			int posicion;
			boolean posicionSalida;
			do {
				numeros2[i] = (int) Math.round(Math.random() * (numeros.length-1 - 0) + 0);
				
				
				for(int j = 0; j < i; j++) {
					
					if(numeros2[j] == posicion) {
						posicionSalida = true;
					}
				}
			}while(posicionSalida);
			
			numeros2[i]=posicion;
			
			
			}
		
		System.out.print(numeros[2]);
		}

	}

}
