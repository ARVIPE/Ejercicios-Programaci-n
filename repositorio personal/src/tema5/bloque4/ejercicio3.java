package tema5.bloque4;

public class ejercicio3 {

	public static void main(String[] args) {

		int j = 0;
		int i = 0;
		int parteentera[] = Utils.obtenernumeroaleatorioentero(10, 0, 100);
		float partedecimal[] = Utils.obtenernumeroaleatoriodecimal(10, 0, 100);
		int contador = 0;
		float sumatotal[] = Utils.obtenernumeroaleatoriodecimal(10, 0, 100);

		

		System.out.println("El array es: ");
		for (i = 0; i < parteentera.length; i++) {
		System.out.print(parteentera[i]  + "   ");
		}
		
		System.out.println();

		for (i = 0; i < partedecimal.length; i++) {
			partedecimal[i] = partedecimal[i] / 100;
			System.out.print(partedecimal[i] + "   ");
		}

		System.out.println();

		for (i = 0; i < partedecimal.length; i++) {
			if (partedecimal[i] < 0.50 && partedecimal[i] <= 0.49) {

				contador++;

			}
		}
		System.out.print("Hay " + contador + " números cuya parte decimal se encuentra por debajo de 0.50");

		System.out.println();

		for (i = 0; i < sumatotal.length; i++) {
			sumatotal[i] = (parteentera[i] + partedecimal[i]);
		}
		System.out.print(sumatotal[i]);

	}

}
