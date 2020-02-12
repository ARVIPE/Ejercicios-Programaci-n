package tema6.tema6Bloque3;

import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class ejerciciosbloq3 {
	
	public ejerciciosbloq3 () {
		
	}
	
	public static void ejercicio01() {
		
		System.out.println("\nValor máximo para un Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo para un Byte: " + Byte.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Byte: " + Byte.SIZE);
		
		System.out.println("\nValor máximo para un Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo para un Integer: " + Integer.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Integer: " + Integer.SIZE);
		
		System.out.println("\nValor máximo para un Short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo para un Short: " + Short.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Short: " + Short.SIZE);
		
		System.out.println("\nValor máximo para un Long: " + Long.MAX_VALUE);
		System.out.println("Valor mínimo para un Long: " + Long.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Long: " + Long.SIZE);
		
		System.out.println("\nValor máximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo para un Float: " + Float.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Float: " + Float.SIZE);
		
		System.out.println("\nValor máximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo para un Double: " + Double.MIN_VALUE);
		System.out.println("Tamaño en bits complemento a 2 para Double: " + Double.SIZE);
	}
	
	
	public static void ejercicio02() {
		String str = JOptionPane.showInputDialog("Introduce una contraseña con mayúsculas, minúsculas con algún dígito y algún carácter noAlfanumerico");
	
		boolean minuscula = false;
		boolean mayuscula = false;
		boolean numero = false;
		boolean noAlfanumerico = false;
		char cadenaDeTexto[] = new char [str.length()];
		
		for (int i = 0; i < cadenaDeTexto.length; i++) {
			cadenaDeTexto[i] = str.charAt(i);
			
			if(Character.isLowerCase(cadenaDeTexto[i])) { 
				minuscula = true;
			}
			if(Character.isUpperCase(cadenaDeTexto[i])) { 
				mayuscula = true;
			}
			if(Character.isDigit(cadenaDeTexto[i])) {
				numero = true;
			}
			//Tiene que haber un caracter que no sea ni letra ni numero
			if(!Character.isLetterOrDigit(cadenaDeTexto[i])){
				noAlfanumerico = true;
			}
			
		}
		if(minuscula == true && mayuscula == true && numero == true && noAlfanumerico) {
			System.out.println("La contraseña es aceptada");
		}else {
			System.out.println("La contraseña no es valida");
		}
	}
	
	public static void ejercicio03() {

		for (int i = 0; i <= 100; i++) {

			String hexadecimal = Integer.toHexString(i);

			System.out.println(hexadecimal);

		}

	}

	public static void main(String[] args) {
		ejercicio02();
	}

}
