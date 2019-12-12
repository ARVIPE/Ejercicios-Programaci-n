package tema4.examenPOO;

public class Fuente extends Pilaobjeto {
	

	public Fuente(int id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	public boolean seRompe() {
		
		if(seRompe >= 0.2) {
			System.out.println("Se rompe");
			return true;
		}
			System.out.println("No se rompe");
		return false;
		
	}

}
