package tema5.bloque2;

public class Utils_Arrays {
	
	public static int obtenerNumeroAzar () {
		return (int) Math.round(Math.random() * 100);
	}
	
	public static int obtenerNumeroalAzar (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}


}

	
	
