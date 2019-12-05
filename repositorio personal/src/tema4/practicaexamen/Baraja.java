package tema4.practicaexamen;

import java.util.Arrays;

public class Baraja {
	Carta carta[] = new Carta[51];
	
	private String picas;
	private String diamantes;
	private String treboles;
	private String corazones;
	
	
	public void Baraja() {
		
		for(int i = 0; i < 13; i++) {
		
			
			carta[i] = new Carta(i+1, "picas", i + "picas", i );
		}
		
		for(int i = 0; i < 27; i++) {
		
			
			carta[i] = new Carta(i+1, "diamantes", i + "diamantes", i );
		}
		
		for(int i = 0; i < 40; i++) {
			
			
			carta[i] = new Carta(i+1, "treboles", i + "treboles", i );
		}
		
		for(int i = 0; i < carta.length; i++) {
		
			
			carta[i] = new Carta(i+1, "corazones", i + "corazones", i );
		}
		
		
	
		
		
		
	}

	@Override
	public String toString() {
		return "Baraja [carta=" + Arrays.toString(carta) + ", picas=" + picas + ", diamantes=" + diamantes
				+ ", treboles=" + treboles + ", corazones=" + corazones + "]";
	}
	

	
	

}
