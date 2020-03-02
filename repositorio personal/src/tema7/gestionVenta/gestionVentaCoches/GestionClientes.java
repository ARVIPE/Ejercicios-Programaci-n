package tema7.gestionVenta.gestionVentaCoches;

import java.text.SimpleDateFormat;
import java.util.List;

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
		
		ControladorCliente.almacenar(clien);  

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
			if (!str.equals("")) 
				co.setIdfabricante(0);
			System.out.print("\nIntroduzca 'bastidor' del coche  ('Intro' para no modificar): ");
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
