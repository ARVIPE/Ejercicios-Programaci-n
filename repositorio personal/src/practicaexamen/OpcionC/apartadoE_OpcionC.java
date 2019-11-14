package practicaexamen.OpcionC;

public class apartadoE_OpcionC {

	public static void main(String[] args) {

	int array[] = new int [20];

	int aux;

	boolean NumRepetido=false;

	for (int i = 0; i<array.length; i++){
		
		aux = (int) Math.round(Math.random() * (40 - 0) + 0);

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
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i] + "    ");
		}
	}
}

	

	
	