package tema6.tema6Bloque7.ejercicio1;

import java.util.ArrayList;	
import java.util.List;
import java.util.Scanner;


public class TresDigitosIntroducidos {
	
	private static List<PalabraMagicaIntroducidaListener> palabraMagicaIntroducidaListeners = new ArrayList<PalabraMagicaIntroducidaListener>();
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra con al menos 3 digitos");
		String palabra = sc.nextLine();
		int i = 0;
		int contador = 0;
		
		do{
			char caracter = palabra.charAt(i);
			
			if(Character.isDigit(caracter)) {
				contador++;
				firePalabraMagicaIntroducidaListeners(new PalabraMagicaIntroducidaEvent(palabra));
			}
		
			i++;
		}while(i<palabra.length() && contador == 3);
		
		
	}

	/**
	 * 
	 * @param listener
	 */
	public static void addPalabraMagicaIntroducidaListener (PalabraMagicaIntroducidaListener listener) {
		palabraMagicaIntroducidaListeners.add(listener);
	}

	/**
	 * 
	 * @param listener
	 */
	public static void removePalabraMagicaIntroducidaListener (PalabraMagicaIntroducidaListener listener) {
		palabraMagicaIntroducidaListeners.remove(listener);
	}

	/**
	 * 
	 */
	public static void firePalabraMagicaIntroducidaListeners(PalabraMagicaIntroducidaEvent event) {
		for (PalabraMagicaIntroducidaListener listener : palabraMagicaIntroducidaListeners) {
			listener.palabraMagicaIntroducida(event);
		}
	}
}
