package tema7.gestionVenta.gestionVentaCoches;


import java.text.SimpleDateFormat;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import tema7.gestionVenta.gestionVentaCoches.modelo.Cliente;
import tema7.gestionVenta.gestionVentaCoches.modelo.Venta;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorCliente;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorVenta;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ErrorBBDDException;


public class GestionVenta {

	/**
	 * @throws java.text.ParseException 
	 * @throws ParseException 
	 * 
	 */
	public static void menuGestion() throws ParseException, java.text.ParseException {

		int opcionElegida = -1;
		do {
			try {
				System.out.println("\n\t\t\tGESTIÓN DE COCHES");
				
				System.out.println("\n\t1.- Listado de ventas.");
				System.out.println("\t2.- Alta de ventas.");
				System.out.println("\t3.- Modificación de ventas.");
				System.out.println("\t4.- Baja de ventas.");
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
	 * @throws java.text.ParseException 
	 * @throws ParseException 
	 */
	private static void alta () throws ErrorBBDDException, ParseException, java.text.ParseException {
		System.out.println("\n\tAlta de coche\n");
		
		Venta ven = new Venta();
		System.out.print("\nIntroduzca 'id' del cliente: ");
		ven.setIdCliente(Utils.getIntConsola(0));
		System.out.print("\nIntroduzca 'id' del concesionario: ");
		ven.setIdConcesionario(Utils.getIntConsola(0));
		System.out.println("\nIntroduzca 'id' del coche: ");
		ven.setIdCoche((Utils.getIntConsola(0)));
		System.out.println("\nIntroduzca 'fecha' de venta");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		ven.setFecha(sdf.parse(Utils.getStringConsola()));
		System.out.println("\nIntroduzca 'precio' de venta");
		ven.setPrecioVenta(Utils.getIntConsola(0));
		
		
		
		ControladorVenta.almacenar(ven);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 * @throws ParseException
	 * @throws java.text.ParseException 
	 */
	private static void modificacion() throws ErrorBBDDException, ParseException, java.text.ParseException{
		System.out.println("\n\tModificacion de venta");
		
		Venta ven = seleccionPorUsuario();
		if(ven != null) {
			System.out.println("\n\tIntroduzca 'id' del cliente ('Intro' para modificar): ");
			String str = Utils.getStringConsola();
			int idCliente = Integer.parseInt(str);
			if (!str.equals("")) 
				ven.setIdCliente(idCliente);
			
			System.out.println("\n\tIntroduzca 'id' del Concesionario ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			int idConcesionario = Integer.parseInt(str);
			if (!str.equals("")) 
				ven.setIdConcesionario(idConcesionario);
			
			System.out.println("\n\tIntroduzca 'id' del coche ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			int idCoche = Integer.parseInt(str);
			if (!str.equals("")) 
				ven.setIdCoche(idCoche);
			
			System.out.println("\n\tIntroduzca 'fecha' de venta ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if(!str.equals("")) ven.setFecha(sdf.parse(Utils.getStringConsola()));
			
			System.out.println("\n\tIntroduzca 'precio' de venta ('Intro' para modificar): ");
			str = Utils.getStringConsola();
			

			
			ControladorVenta.almacenar(ven);
			
			System.out.println("\n\tModificado correctamente. Pulse 'Intro' para continuar ");
			Utils.pausa();
		}
	}

	
	
	



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
