package practicaexamen.OpcionC;

public class apartadoC_OpcionC {

	public static void main(String[] args) {
		
		int array[] = new int[20];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		for(int i = 0; i < array.length; i++) {
		
			System.out.print(array[i] + "   ");
			
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 1; j <= array[i]; j++) {
				if(array[i]%j == 0) {
					
					System.out.println("Los divisores de " + array[i] + " son " + j);
				}
			}
		}
	}
}
		
		
	


