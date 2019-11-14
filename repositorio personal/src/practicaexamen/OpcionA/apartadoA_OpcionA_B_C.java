package practicaexamen.OpcionA;

import java.lang.reflect.Array;

public class apartadoA_OpcionA_B_C {

	public static void main(String[] args) {

		//Generamos 100 numeros aleatorios del 0-1000
		int array[] = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			 array[i] = (int) Math.round(Math.random() * 1000);
		}
		
		//Imprimimos en pantalla el valor del array
		for(int i = 0; i < array.length; i++) {
		System.out.print(array[i] + "   ");
		}
		
		//Realizamos un salto de l�nea
		System.out.println();
		
		
		//Realizamos la suma de todos los valores del array
		int suma = array[0];
		
		for(int i = 1; i < array.length; i++) {
			suma = suma + array[i];
		}
		
		
		//Aqu� ya le decimos que nos imprima el valor de la suma
		System.out.print("La suma es: " + suma);
	
		System.out.println();
		
		//Ahora realizamos la media
		float media = suma/array.length;
		
		//Imprimimos la media
		System.out.print("La media es: " + media);
		
		System.out.println();
		
		//Buscamos el mayor y el menor n�mero del array
		int mayor = array[0];
        int menor = array[0];
       
        for (int i = 0; i < array.length; i++) {
            if(array [i] > mayor) {
                mayor = array[i];
            }
            if(array[i] < menor) {
                menor = array[i];
            }
        }
        
        //Ya aqu� imprimimos en pantalla el mayor y el menor
        System.out.println("El mayor valor es: "+ mayor);
        System.out.println("El menor valor es: "+ menor);
    }
}
