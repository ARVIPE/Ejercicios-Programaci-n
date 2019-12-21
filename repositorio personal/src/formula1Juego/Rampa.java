package formula1Juego;

public class Rampa extends Obstaculo {

	public Rampa(String nombre) {
		super(nombre);
		
	}
	
	public void retroceder() {
		getImpulso();
		setImpulso(impulso);
		
	}
	
	



}
