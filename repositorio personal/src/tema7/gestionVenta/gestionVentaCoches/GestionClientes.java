package tema7.gestionVenta.gestionVentaCoches;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import tema7.gestionVenta.gestionVentaCoches.modelo.Cliente;
import tema7.gestionVenta.gestionVentaCoches.modelo.Coche;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorCliente;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorCoche;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ErrorBBDDException;


public class GestionClientes {

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
				
				System.out.println("\n\t1.- Listado de clientes.");
				System.out.println("\t2.- Alta de clientes.");
				System.out.println("\t3.- Modificación de clientes.");
				System.out.println("\t4.- Baja de clientes.");
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
		List<Cliente> clientes = ControladorCliente.getAll();
		System.out.println("\n\tListado de clientes: \n");
		for (Cliente clien : clientes) {
			System.out.println("\t" + clien.toString());
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
		System.out.println("\n\tAlta de clientes\n");
		
		Scanner sc = new Scanner(System.in);
		
		Cliente clien = new Cliente();
		System.out.print("\nIntroduzca 'nombre' del cliente: ");
		clien.setNombre(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'apellidos' del cliente: ");
		clien.setApellidos(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'localidad' del cliente: ");
		clien.setLocalidad(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'dniNie' del cliente ");
		clien.setDniNie(Utils.getStringConsola());
		System.out.println("\nIntroduzca 'fechaNac' del cliente ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		clien.setFechaNac(sdf.parse(Utils.getStringConsola()));
		
		System.out.println("\nIntroduzca 'actividad' del cliente: ");
		clien.setActivo(sc.equals(sc));
		ControladorCliente.almacenar(clien);  

		System.out.println("\n\tInsertado correctamente!. Pulse 'Intro' para continuar");
		Utils.pausa();
	}



	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacion () throws ErrorBBDDException {
		System.out.println("\n\tModificación de \n");
		
		Cliente clien = seleccionPorUsuario();
		
		if (clien != null) {		
			System.out.print("\nIntroduzca nombre del cliente ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				clien.setNombre(str);
			System.out.print("\nIntroduzca 'apellidos' del cliente  ('Intro' para no modificar): ");
			if (!str.equals("")) 
				clien.setApellidos(str);
			System.out.println("\nIntroduzca 'localidad' del cliente ('Intro' para no modificar: ");
			str = Utils.getStringConsola();
			if(!str.equals(""))
				clien.setLocalidad(str);
			System.out.println("\nIntroduzca 'dniNie' del cliente ('Intro para no modificar: ");
			str = Utils.getStringConsola();
			if(!str.equals(""))
				clien.setDniNie(str);
			
			ControladorCliente.almacenarModificado(clien);  

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
		
		Cliente clien = seleccionPorUsuario();
		
		if (clien != null) {		
			System.out.print("\n¿Realmente desea eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorCliente.eliminar(clien);  
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
	private static Cliente seleccionPorUsuario () throws ErrorBBDDException {
		Cliente clien = null;
		int id = -2;
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			if (id == -1) {
				listado(false);
			}
			else {
				if (id != 0) {
					clien = ControladorCliente.get(id);
					if (clien == null) {
						System.out.println("\tError. Ha especificado un ID inválido.");
					}
				}
			}
		} while (clien == null && id != 0);
		return clien;
	}
}
