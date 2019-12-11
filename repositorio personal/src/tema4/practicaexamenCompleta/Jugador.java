package tema4.practicaexamenCompleta;

public class Jugador {
	public static final int TAMANO_MANO = 5;

	private String nombre;
	
	private Carta mano[] = new Carta[TAMANO_MANO];

	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}

	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}
	
	public void mostrarCartas() {
		System.out.println("-> Mano jugador: "+this.nombre);
		for (Carta carta : mano) {
			System.out.println(carta.toString());
		}
	}
	
	public void jugada() {
		System.out.println("-> Jugada de "+this.nombre);

		if (this.tienePoker()) {
			System.out.println("🃏PÓKER");
		} else if (this.tieneTrio()) {
			System.out.println("🃏TRÍO");
		} if (this.tienePareja()) {
			System.out.println("🃏PAREJA");
		} else {
			System.out.println("🃏NADA 🙁");
		}

	}

	private boolean tienePareja() {
		return cartasIguales() == 2;
	}

	private boolean tieneTrio() {
		return cartasIguales() == 3;
	}

	private boolean tienePoker() {
		return cartasIguales() == 4;
	}

	private int cartasIguales() {
		final int DESCONOCIDO = -1;
		int cartasIguales = 0;
		int auxCartasIguales = DESCONOCIDO;

		for (Carta carta : mano) {
			int valorCarta = DESCONOCIDO;

			for (Carta cartaTmp : mano) {
				if (carta.getId() != cartaTmp.getId() && 
				carta.getValor() == cartaTmp.getValor() && 
				valorCarta != DESCONOCIDO) {
					cartasIguales++;
					valorCarta = carta.getValor();
				}				
			}

		}
		return cartasIguales;


		// // Juego comparando con primera carta
		// int jugadaReferencia = this.mano[0].getValor();
		// for (int i = 0; i<Jugador.TAMANO_MANO; i++) {
		// 	Carta carta = this.mano[i];
		// 	if (carta.getValor() == jugadaReferencia && i != 0) {

		// 	}	
		// }
	}

}
