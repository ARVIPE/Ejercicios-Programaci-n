package tema7.gestionVenta.gestionVentaCoches;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import tema7.gestionVenta.gestionVentaCoches.modelo.Coche;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorCoche;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ErrorBBDDException;


public class GestionCoche {

	/**
	 * @throws java.text.ParseException 
	 * @throws ParseException 
	 * @throws SQLException 
	 * 
	 */
	public static void menuGestion() throws ParseException, java.text.ParseException, SQLException {

		int opcionElegida = -1;
		do {
			try {
				System.out.println("\n\t\t\tGESTIÓN DE COCHES");
				
				System.out.println("\n\t1.- Listado de coches.");
				System.out.println("\t2.- Alta de coches.");
				System.out.println("\t3.- Modificación de coche.");
				System.out.println("\t4.- Baja de coche.");
				System.out.println("\t0.- Salir");
				System.out.println("\n\tElija una opción: ");
				
				opcionElegida = Utils.getIntConsola(0, 4);
				
				switch (opcionElegida) {
				case 0:
					Main.menuPrincipal();
					break;
				case 1:
					listado(true);
					break;
				case 2: 
					alta();
					break;
				case 3: 
					modificacion();
					break;
				case 4: 
					baja();
					break;
				}
			} catch (ErrorBBDDException e) {
				System.out.println("\n\t\t\tError de acceso a datos: " + e.getMessage() + "\n");
				e.printStackTrace();
			}
		} while (opcionElegida != 0);
	}

	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void listado(boolean pausafinal) throws ErrorBBDDException {
		List<Coche> coches = ControladorCoche.getAll();
		System.out.println("\n\tListado de coches: \n");
		for (Coche co : coches) {
			System.out.println("\t" + co.toString());
		}
		if (pausafinal) {
			System.out.println("\n\tPulse 'Intro' tecla para continuar");
			Utils.pausa();
		}
	}
	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void alta () throws ErrorBBDDException {
		System.out.println("\n\tAlta de coche\n");
		
		Scanner sc = new Scanner(System.in);
		
		Coche co = new Coche();
		
		System.out.println("\nPulsa -1 para ver la lista de fabricantes");
		String str = sc.next();
		if(str.equalsIgnoreCase("-1")) {
			GestionFabricante.listado(true);
		}
		System.out.print("\nIntroduzca 'id' del fabricante: ");
		co.setIdfabricante(Utils.getIntConsola(0));
		System.out.print("\nIntroduzca 'bastidor' del coche: ");
		co.setBastidor(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'modelo' del coche: ");
		co.setModelo(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'color' del coche: ");
		co.setColor(Utils.getStringConsola());
		
		
		ControladorCoche.almacenar(co);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}



	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion () throws ErrorBBDDException {
		System.out.println("\n\tModificación de fabricante\n");
		
		Coche co = seleccionPorUsuario();
		
		if (co != null) {		
			System.out.print("\nIntroduzca 'id' del fabricante ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			int idFabricante = Integer.parseInt(str);
			if (!str.equals("")) 
				co.setIdfabricante(idFabricante);
			System.out.print("\nIntroduzca 'bastidor' del coche  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				co.setBastidor(str);
			System.out.println("\nIntroduzca 'modelo' del coche ('Intro' para no modificar: ");
			str = Utils.getStringConsola();
			if(!str.equals(""))
				co.setModelo(str);
			System.out.println("\nIntroduzca 'color' del coche ('Intro para no modificar: ");
			str = Utils.getStringConsola();
			if(!str.equals(""))
				co.setColor(str);
			
			ControladorCoche.almacenarModificado(co);  

			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}

	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja () throws ErrorBBDDException {
		System.out.println("\n\tModificación de coche\n");
		
		Coche co = seleccionPorUsuario();
		
		if (co != null) {		
			System.out.print("\n¿Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorCoche.eliminar(co);  
				System.out.println("\n\tEliminado correctamente!. Pulse 'Intro' para continuar");
				Utils.pausa();
			}
		}
	}

	
	
	/**
	 * 
	 * @return
	 * @throws ErrorBBDDException
	 */
	private static Coche seleccionPorUsuario () throws ErrorBBDDException {
		Coche co = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			if (id == -1) {
				listado(false);
			}
			else {
				if (id != 0) {
					co = ControladorCoche.get(id);
					if (co == null) {
						System.out.println("\tError. Ha especificado un ID inválido.");
					}
				}
			}
		} while (co == null && id != 0);
		return co;
	}
}
