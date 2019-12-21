package formula1Juego;

public class ManchaAceite extends Obstaculo {

	public ManchaAceite(String nombre) {
		super(nombre);
		
	}
	
	public void retroceder() {
		getImpulso();
		setImpulso(-impulso);
		
	}
	



}
