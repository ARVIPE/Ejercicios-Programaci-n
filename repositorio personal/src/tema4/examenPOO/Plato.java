package tema4.examenPOO;

public class Plato extends Pilaobjeto {
	
	
	
	public Plato(int id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	public boolean seRompe() {
		
		if(seRompe >= 0.1) {
			System.out.println("Se rompe");
			return true;
		}
			System.out.println("No se rompe");
			return false;
		
	}

}
