package tema4.practicaexamenCompleta;

public class Carta {
	public static final String PICAS = "Picas";
	public static final String DIAMANTES = "Diamantes";
	public static final String TREBOLES = "Treboles";
	public static final String CORAZONES = "Corazones";
	public static final int NUM_CARTAS_PALO = 13;

	private int valor;
	private String palo;

	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	public int getId() {
		switch (palo) {
			case Carta.PICAS: 
				return valor;
			case Carta.DIAMANTES: 
				return valor+NUM_CARTAS_PALO;
			case Carta.TREBOLES: 
				return valor+NUM_CARTAS_PALO*2;
			default:
				// Carta.CORAZONES 
				return valor+NUM_CARTAS_PALO*3;
		}
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + ", id=" + getId() + "]";
	}

}
