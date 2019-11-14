package practicaexamen.OpcionB;

public class apartadoD_OpcionB {

	public static void main(String[] args) {
		
		int array1[] = new int[100];
		
				
		System.out.println();
		

		 int array[] = new int[10];
		 
		 
		 
		 	System.out.println();
		 	boolean NumRepetido = true;
			for (int i = 0; i<array.length; i++){
				
				int aux = (int) Math.round(Math.random() * (99 - 0) + 0);

				for(int j = 0; j < array.length; j++) {

							if (array[j]==aux){
							NumRepetido=true;
							break;
						}
					}

					if (NumRepetido==true) {
					NumRepetido=false;
					}
					else{
					array[i]=aux;
					}
				}
			
			System.out.println();
			
			for(int i = 0; i < array.length; i++) {
			
				array1[array[i]]=1;
			}
			
			for(int i = 0; i < array1.length; i++) {
				System.out.print(array1[i] + "    ");
			}
	}
}
	



