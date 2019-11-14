package practicaexamen.OpcionB;

public class apartadoE_OpcionB {

	public static void main(String[] args) {
		
		int array[] = new int[100];
		
		array[0] = 1;
		array[1] = 1;
		
		for(int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i - 2];
		}
		System.out.println("El resultado es:");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

	}

}
