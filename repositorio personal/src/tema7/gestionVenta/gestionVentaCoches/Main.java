package tema7.gestionVenta.gestionVentaCoches;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menuPrincipal();
	}

	
	/**
	 * 
	 */
	private static void menuPrincipal() {

		int opcionElegida;
		do {
			System.out.println("\n\t\t\tGESTIÓN DE VENTAS DE COCHES");
			
			System.out.println("\n\t1.- Gestión de fabricantes.");
			System.out.println("\t2.- Gestión de concesionarios.");
			System.out.println("\t3.- Gestión de clientes.");
			System.out.println("\t4.- Gestión de coches.");
			System.out.println("\t5.- Gestión de ventas.");
			System.out.println("\t0.- Salir");
			System.out.println("\n\tElija una opción: ");
			
			opcionElegida = Utils.getIntConsola(0, 5);
			
			switch (opcionElegida) {
			case 0:
				System.out.println("\n!Qué tenga un feliz día!");
				break;
			case 1:
				GestionFabricante.menuGestion();
			case 2:
				GestionConcesionario.menuGestion();
			case 4:
				GestionCoche.menuGestion();
			}
		} while (opcionElegida != 0);
	}
	
}
