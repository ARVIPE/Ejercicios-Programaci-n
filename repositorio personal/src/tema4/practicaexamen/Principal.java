package tema4.practicaexamen;

public class Principal {

	public static void main(String[] args) {

		Baraja baraja = new Baraja();

		baraja.imprimir();

		System.out.println("Carta de arriba hacia abajo es: ");
		baraja.cartasdeArribaHaciaAbajo();
		baraja.imprimir();

		System.out.println("Carta de abajo hacia arriba es: ");
		baraja.cartasdeAbajoHaciaArriba();
		baraja.imprimir();

	}

}
