package tema7.gestionVenta.gestionVentaCoches;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;


import tema7.gestionVenta.gestionVentaCoches.modelo.Cliente;
import tema7.gestionVenta.gestionVentaCoches.modelo.Coche;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorCliente;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ControladorCoche;
import tema7.gestionVenta.gestionVentaCoches.modelo.controladores.ErrorBBDDException;


public class GestionClientes {
	
	// Iniciaremos el objeto de conexi�n a null para poder usarlo cuando queramos
		static Connection conn = null;

		public static void menuGestion() throws SQLException, ErrorBBDDException, ParseException {

			Scanner sc = new Scanner(System.in);
			int option = 0;

			do {

				System.out.println("\n\t\t\tGESTI�N DE CLIENTES");

				System.out.println("\n\t1.- Listado de clientes.");
				System.out.println("\t2.- A�adir cliente.");
				System.out.println("\t3.- Modificar cliente.");
				System.out.println("\t4.- Borrar cliente.");
				System.out.println("\t0.- Salir");
				System.out.println("\n\tElija una opci�n: ");

				option = sc.nextInt();

				switch (option) {
				case 0:
					Main.menuPrincipal();
					break;
				case 1:
					listado(true);
					break;
				case 2:
					darDeAlta();
					break;
				case 3:
					modificar();
					break;
				case 4:
					baja();
					break;
				}

			} while (option != 0);
		}
		
		/**
		 * @throws ParseException 
		 * 
		 */
		
		public static void listado(boolean pausafinal) throws ErrorBBDDException, ParseException {
			List<Cliente> cli = ControladorCliente.getAll();
			System.out.println("\n\tListado de clientes: \n");
			for (Cliente cliente : cli) {
				System.out.println("\t" + cliente.toString());
			}

		}
		
		/**
		 * @throws ParseException 
		 * 
		 */
		
		private static void darDeAlta() throws ErrorBBDDException, SQLException, ParseException {
			System.out.println("\n\tAlta de cliente\n");

			Connection conn = null;

			Scanner sc = new Scanner(System.in);

			Cliente cli = new Cliente();

			System.out.print("\nIntroduzca 'Nombre' del cliente: ");
			cli.setNombre(sc.next());
			System.out.print("\nIntroduzca 'Apellidos' del cliente: ");
			cli.setApellidos(sc.next());
			System.out.print("\nIntroduzca 'Localidad' del cliente: ");
			cli.setLocalidad(sc.next());
			System.out.print("\nIntroduzca 'Dni' del cliente: ");
			cli.setDniNie(sc.next());
			System.out.print("\nIntroduzca 'Fecha de Nacimiento' del cliente: ");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			cli.setFechaNac(sdf.parse(sc.next()));
			

			System.out.println("\nIntroduzca 'Actividad' del cliente: ");
			cli.setActivo(sc.equals(sc));
			ControladorCliente.almacenarNuevo(cli);

			System.out.println("\n\tInsertado correctamente!");

		}
		
		/**
		 * @throws ParseException 
		 * 
		 */
		
		public static void modificar() throws ErrorBBDDException, SQLException, ParseException {
			System.out.println("\n\tModificaci�n del coche: ");
			
			Cliente cli = seleccionPorUsuario();
			
			if(cli != null) {
				
				System.out.println("\n\tIntroduce un 'Nombre' nuevo para el cliente: ");
				Scanner sc = new Scanner(System.in);
				String nombre;
				nombre = sc.next();
				if(!nombre.equals("")) 
					cli.setNombre(nombre);
				
				
				System.out.println("\n\tIntroduce un 'Apellido' nuevo para el cliente: ");
				sc = new Scanner(System.in);
				String apellido;
				apellido = sc.next();
				if(!apellido.equals("")) 
					cli.setApellidos(apellido);
				
				System.out.println("\n\tIntroduce un 'Localidad' nuevo para el cliente: ");
				String localidad;
				localidad = sc.next();
				if(!localidad.equals("")) 
					cli.setLocalidad(localidad);
				
				System.out.println("\n\tIntroduce un 'Dni' nuevo para el cliente: ");
				String dni;
				dni = sc.next();
				if(!dni.equals("")) 
					cli.setDniNie(dni);
				
				System.out.println("\n\tIntroduce una 'Fecha' nueva para el cliente: ");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String fecha;
				fecha = sc.next();
				if(!fecha.equals("")) {
					cli.setFechaNac(sdf.parse(fecha));
				}
					
				ControladorCliente.almacenarModificacion(cli);
				System.out.println("\n\tHas modificado el coche correctamente");
			}
			
		}
		
		/**
		 * 
		 * @throws ErrorBBDDException
		 * @throws SQLException
		 * @throws ParseException
		 */
		
		private static void baja() throws ErrorBBDDException, SQLException, ParseException {
			System.out.println("\n\tEliminaci�n del cliente\n");
			Scanner sc = new Scanner(System.in);
			Cliente cli = seleccionPorUsuario();

			if (cli != null) {
				System.out.print("\n�Realmente desea eliminar el registro? (S/N): ");
				String str = sc.next();
				if (str.equalsIgnoreCase("S")) {
					ControladorCliente.eliminarCliente(cli);
					System.out.println("\n\tEliminado correctamente!");

				}
			}
		}
		
		/**
		 * 
		 * @return
		 * @throws ErrorBBDDException
		 * @throws ParseException 
		 */
		private static Cliente seleccionPorUsuario () throws ErrorBBDDException, ParseException {
			Cliente clien = null;
			int id = -2;
			do {
				System.out.println("\n\tIntroduzca ID del cliente ('-1' - ver listado, '0' - salir): ");
				id = Utils.getIntConsola(-1);
				if (id == -1) {
					listado(false);
				}
				else {
					if (id != 0) {
						clien = ControladorCliente.obtenerId(id);
						if (clien == null) {
							System.out.println("\tError. Ha especificado un ID inv�lido.");
						}
					}
				}
			} while (clien == null && id != 0);
			return clien;
		}

}
