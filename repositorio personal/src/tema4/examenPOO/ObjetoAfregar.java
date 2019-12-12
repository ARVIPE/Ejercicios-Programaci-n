package tema4.examenPOO;


public class ObjetoAfregar{
	
	Pilaobjeto pilasobjeto[] = new Pilaobjeto[12];

	public ObjetoAfregar() {
		int j = 0;
		for (int i = 0; i < 3; i++) {
			pilasobjeto[j] = new Pilaobjeto(j, "Cubierto");
			j++;
		}
		for (int i = 0; i < 3; i++) {
			pilasobjeto[j] = new Pilaobjeto(j, "Fuente");
			j++;
		}
		for (int i = 0; i < 3; i++) {
			pilasobjeto[j] = new Pilaobjeto(j, "Plato");
			j++;
		}
		for (int i = 0; i < 3; i++) {
			pilasobjeto[j] = new Pilaobjeto(j, "Vaso");
			j++;
		}
	}
	
	

	
	
	public void imprimir () {
		System.out.println("ObjetosAfregar");
		for (int i = 0; i < pilasobjeto.length; i++) {
			System.out.println(pilasobjeto[i]);
		}
	}





	public static void limpiar() {
		int totalTrabajo = (int) Math.round(Math.random() * (40 - 20) + 20);
		if (totalTrabajo <= 0) {
			boolean limpiezaTotal = true;
		}
		int pasadasnecesarias = 0;
		pasadasnecesarias++;
	}
}
		
	



