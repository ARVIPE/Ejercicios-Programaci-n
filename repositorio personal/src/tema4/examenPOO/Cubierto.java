package tema4.examenPOO;

public class Cubierto extends Pilaobjeto {
	


	public Cubierto(int id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	public boolean seRompe() {
		
		if(seRompe >= 0.9) {
			System.out.println("Se rompe");
			return true;
		}
			System.out.println("No se rompe");
		return false;
		
	}

}
