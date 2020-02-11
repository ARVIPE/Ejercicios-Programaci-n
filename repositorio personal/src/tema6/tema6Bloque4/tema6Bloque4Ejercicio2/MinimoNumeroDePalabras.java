package tema6.tema6Bloque4.tema6Bloque4Ejercicio2;

public class MinimoNumeroDePalabras  extends Exception{
	
	private int minimoNumeroPalabras;
	
	public MinimoNumeroDePalabras(int minimoNumeroPalabras) {
		this.minimoNumeroPalabras = minimoNumeroPalabras;
		// TODO Auto-generated constructor stub
	}

	public MinimoNumeroDePalabras(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MinimoNumeroDePalabras(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public MinimoNumeroDePalabras(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MinimoNumeroDePalabras(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
