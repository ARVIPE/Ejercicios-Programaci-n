package practicaexamen.OpcionC;

public class apartadoC_OpcionC {

	public static void main(String[] args) {
		
		int array[] = new int[20];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Los divisores de " + array[i] + " son");
			
			if(array[i] % 2 == 0) {
				System.out.print("  2,  ");
			}
			if(array[i] % 3 == 0) {
				System.out.print("  3,  ");
			}
			if(array[i] % 5 == 0) {
				System.out.print("  5,  ");
			}
			if(array[i] % 7 == 0) {
				System.out.print("  7,  ");
			}
			if(array[i] % 9 == 0) {
				System.out.print("  9  ");
			}
			System.out.println();
		}
		
		
	}

}
