package tema7.gestionVenta.gestionVentaCoches;

import java.util.List;			
import tema7.gestionVenta.gestionVentaCoches.modelo.Venta;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorVenta;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ErrorBBDDException;


public class GestionVenta {

	/**
	 * 
	 */
	public static void menuGestion() {

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
					break;
				case 1:
					listado(true);
					break;
				case 2: 
					alta();
					break;
				case 3: 
//					modificacion();
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
		List<Venta> ventas = ControladorVenta.getAll();
		System.out.println("\n\tListado de coches: \n");
		for (Venta ven : ventas) {
			System.out.println("\t" + ven.toString());
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
		
		Venta ven = new Venta();
		System.out.print("\nIntroduzca 'id' del cliente: ");
		ven.setIdCliente(Utils.getIntConsola(0));
		System.out.print("\nIntroduzca 'id' del concesionario: ");
		ven.setIdConcesionario(Utils.getIntConsola(0));
		System.out.println("\nIntroduzca 'id' del coche: ");
		ven.setIdCoche((Utils.getIntConsola(0)));
		System.out.println("\nIntroduzca 'fecha' de venta");
		ven.setFecha(null);
		System.out.println("\nIntroduzca 'precio' de venta");
		ven.setPrecioVenta(Utils.getIntConsola(0));
		
		
		
		ControladorVenta.almacenar(ven);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}



//	/**
//	 * 
//	 * @throws ErrorBBDDException
//	 */
//	private static void modificacion () throws ErrorBBDDException {
//		System.out.println("\n\tModificación de fabricante\n");
//		
//		Venta ven = seleccionPorUsuario();
//		
//		if (ven != null) {		
//			System.out.print("\nIntroduzca 'id' del cliente: ('Intro' para no modificar): ");
//			String str = Utils.getStringConsola();
//			if (!str.equals("")) 
//				ven.setIdCliente(0);
//			System.out.print("\nIntroduzca 'id' del concesionario  ('Intro' para no modificar): ");
//			if (!str.equals("")) 
//				ven.setIdConcesionario(0);
//			System.out.println("\nIntroduzca 'id' del coche ('Intro' para no modificar: ");
//			str = Utils.getStringConsola();
//			if(!str.equals(""))
//				ven.setIdCoche(0);
//			System.out.println("\nIntroduzca 'fecha' de venta ('Intro' para no modificar: ");
//			str = Utils.getStringConsola();
//			if(!str.equals(""))
//				ven.setFecha(str);
//			System.out.println("\Introduzca 'precio' de venta ('Intro' para no modificar: )");
//			str = Utils.getStrinConsola();
//			if(!str.equals(""))
//				ven.setPrecioVenta(0);
//			
//			ControladorVenta.almacenar(ven);  
//
//			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
//			Utils.pausa();
//		}
//	}

	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja () throws ErrorBBDDException {
		System.out.println("\n\tModificación de coche\n");
		
		Venta ven = seleccionPorUsuario();
		
		if (ven != null) {		
			System.out.print("\n¿Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorVenta.eliminar(ven);  
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
	private static Venta seleccionPorUsuario () throws ErrorBBDDException {
		Venta ven = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			if (id == -1) {
				listado(false);
			}
			else {
				if (id != 0) {
					ven = ControladorVenta.get(id);
					if (ven == null) {
						System.out.println("\tError. Ha especificado un ID inválido.");
					}
				}
			}
		} while (ven == null && id != 0);
		return ven;
	}
}
