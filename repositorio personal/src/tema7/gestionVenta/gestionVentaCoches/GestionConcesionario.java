package tema7.gestionVenta.gestionVentaCoches;

import java.sql.SQLException;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import tema7.gestionVenta.gestionVentaCoches.modelo.Concesionario;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorConcesionario;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ErrorBBDDException;


public class GestionConcesionario {

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
				System.out.println("\n\t\t\tGESTI�N DE CONCESIONARIOS");
				
				System.out.println("\n\t1.- Listado de concesionarios.");
				System.out.println("\t2.- Alta de concesionario.");
				System.out.println("\t3.- Modificaci�n de concesionario.");
				System.out.println("\t4.- Baja de concesionario.");
				System.out.println("\t0.- Salir");
				System.out.println("\n\tElija una opci�n: ");
				
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
		List<Concesionario> concesionarios = ControladorConcesionario.getAll();
		System.out.println("\n\tListado de concesionarios: \n");
		for (Concesionario con : concesionarios) {
			System.out.println("\t" + con.toString());
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
		System.out.println("\n\tAlta de concesionario\n");
		
		Concesionario con = new Concesionario();
		System.out.print("\nIntroduzca 'CIF' del concesionario: ");
		con.setCif(Utils.getStringConsola());
		System.out.print("\nIntroduzca 'Nombre' del concesionario: ");
		con.setNombre(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'Localidad' del concesionario: ");
		con.setLocalidad(Utils.getStringConsola());
		
		ControladorConcesionario.almacenar(con);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}



	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion () throws ErrorBBDDException {
		System.out.println("\n\tModificaci�n de fabricante\n");
		
		Concesionario co = seleccionPorUsuario();
		
		if (co != null) {		
			System.out.print("\nIntroduzca 'cif' del concesionario  ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				co.setCif(str);
			System.out.println("\nIntroduzca 'nombre' del concesionario ('Intro' para no modificar: ");
			str = Utils.getStringConsola();
			if(!str.equals(""))
				co.setNombre(str);
			System.out.println("\nIntroduzca 'localidad' del concesionario ('Intro para no modificar: ");
			str = Utils.getStringConsola();
			if(!str.equals(""))
				co.setLocalidad(str);
			ControladorConcesionario.almacenarModificado(co);  

			System.out.println("\n\tModificado correctamente!. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}

	
	
	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void baja () throws ErrorBBDDException {
		System.out.println("\n\tModificaci�n de concesionario\n");
		
		Concesionario con = seleccionPorUsuario();
		
		if (con != null) {		
			System.out.print("\n�Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorConcesionario.eliminar(con);  
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
	private static Concesionario seleccionPorUsuario () throws ErrorBBDDException {
		Concesionario con = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del concesionario ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			if (id == -1) {
				listado(false);
			}
			else {
				if (id != 0) {
					con = ControladorConcesionario.get(id);
					if (con == null) {
						System.out.println("\tError. Ha especificado un ID inv�lido.");
					}
				}
			}
		} while (con == null && id != 0);
		return con;
	}
}
