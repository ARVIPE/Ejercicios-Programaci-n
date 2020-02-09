package tema6;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class ejerciciosbloq3 {
	
	public ejerciciosbloq3 () {
		
	}
	
	public static void ejercicio01() {
		
		System.out.println("\nValor m�ximo para un Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor m�nimo para un Byte: " + Byte.MIN_VALUE);
		System.out.println("Tama�o en bits complemento a 2 para Byte: " + Byte.SIZE);
		
		System.out.println("\nValor m�ximo para un Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor m�nimo para un Integer: " + Integer.MIN_VALUE);
		System.out.println("Tama�o en bits complemento a 2 para Integer: " + Integer.SIZE);
		
		System.out.println("\nValor m�ximo para un Short: " + Short.MAX_VALUE);
		System.out.println("Valor m�nimo para un Short: " + Short.MIN_VALUE);
		System.out.println("Tama�o en bits complemento a 2 para Short: " + Short.SIZE);
		
		System.out.println("\nValor m�ximo para un Long: " + Long.MAX_VALUE);
		System.out.println("Valor m�nimo para un Long: " + Long.MIN_VALUE);
		System.out.println("Tama�o en bits complemento a 2 para Long: " + Long.SIZE);
		
		System.out.println("\nValor m�ximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor m�nimo para un Float: " + Float.MIN_VALUE);
		System.out.println("Tama�o en bits complemento a 2 para Float: " + Float.SIZE);
		
		System.out.println("\nValor m�ximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor m�nimo para un Double: " + Double.MIN_VALUE);
		System.out.println("Tama�o en bits complemento a 2 para Double: " + Double.SIZE);
	}
	
	
	public static void ejercicio02() {
		char cadenaTexto[] = new char[] {'@','H', 'o', 'l', 'a', ' ', 'A', 'm', 'i', 'g', 'o', ' ', '2', '5', '5', '\n'};
		
		
		System.out.println ("\nAnalizar� el array de caracteres: " + cadenaTexto.toString());
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			System.out.println("'" + cadenaTexto[i] + "' es min�scula: " + Character.isLowerCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es may�scula: " + Character.isUpperCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es d�gito: " + Character.isDigit(cadenaTexto[i]));
		
			
			
		}
	}
	
	
	public static void ejercicio03() {

		for (int i = 0; i <= 100; i++) {

			String hexadecimal = Integer.toHexString(i);

			System.out.println(hexadecimal);

		}

	}

	public static void main(String[] args) {
		ejercicio01();
	}

}
