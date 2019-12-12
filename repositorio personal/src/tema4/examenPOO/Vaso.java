package tema4.examenPOO;

public class Vaso extends Pilaobjeto {
	
		public Vaso(int id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

		public boolean seRompe() {
		
		if(seRompe >= 0.3) {
			System.out.println("Se rompe");
			return true;
		}
		System.out.println("No se rompe");
		return false;
		
	}

}
