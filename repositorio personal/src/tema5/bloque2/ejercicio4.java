package tema5.bloque2;


public class ejercicio4 {

	public static void main(String[] args) {
		
		int array[] = new int [5];
		
		
		for (int i = 0; i < array.length; i++) {
			array [i] = (int)Math.round(Math.random() * 100);
			System.out.println(array[i] + "");
		}
		
		System.out.println("");
		
		int aux=array[array.length-1];
		for (int i = array.length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		
		array[0]=aux;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i] + "");
		}
	}
}
 
		
		