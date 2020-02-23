package tema7.ejercicioVentaCoches;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class GestionDeFabricantes{
	
	static Connection con= null;
	
	public static void menuGestionDeFabricantes(Connection con) throws SQLException {
		
		try {
			con=ConnectionManagerV2.getConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner opcion = new Scanner(System.in);
        int Opcion;
		
        do {
        System.out.println();
		System.out.println("1) Listado de fabricantes.");
		System.out.println("2) Alta de fabricante.");
		System.out.println("3) Modificación de fabricante.");
		System.out.println("4) Baja de fabricante.");
		System.out.println("0) Salir");
		
		Opcion = opcion.nextInt();
		
		if(Opcion == 1) {
        	ListadoDeFabricantes(con);
        }
        
        if(Opcion == 2) {
        	AltaFabricante(con);
        }
        
        if(Opcion == 3) {
        	ModificarFabricante(con);
        }
        
        if(Opcion == 4) {
        	BajaFabricante(con);
        }
		
        }while((Opcion != 0));
        
        if(Opcion == 0) {
        	Principal.MenuPrincipal();
        }
       
        
	}

	public static void ListadoDeFabricantes(Connection con) throws SQLException {
		// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
		// Statement
		Statement s = (Statement) con.createStatement();

		// La ejecución de la consulta se realiza a través del objeto Statement y se
		// recibe en forma de objeto
		// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
		// obtenidos por la consulta
		ResultSet rs = s.executeQuery("select * from fabricante");

		// Navegación del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
		}
	}
	
	public static void AltaFabricante(Connection con) throws SQLException {
		
		Scanner opcion = new Scanner(System.in);
		System.out.println("Introduzca un ID");
		int ID = opcion.nextInt();
		System.out.println("Introduzca un CIF");
		String CIF = opcion.next();
		System.out.println("Introduzca un nombre");
		String NOMBRE = opcion.next();
		
		Statement s = (Statement) con.createStatement();

		s.executeUpdate("INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " + "VALUES  (" + ID + ", '" + CIF + "', '" + NOMBRE + "')");
		
		s.close();
	}
	
	public static void BajaFabricante(Connection con) throws SQLException {
		
		Scanner opcion = new Scanner(System.in);
		System.out.println("Introduzca ID del fabricante");
		int ID = opcion.nextInt();
		
		Statement s = (Statement) con.createStatement();

		s.executeUpdate("DELETE FROM `tutorialjavacoches`.`fabricante` WHERE (`id` = " + ID + ")");
		
		s.close();
	}
	
	public static void ModificarFabricante(Connection con) throws SQLException {
		
		Scanner opcion = new Scanner(System.in);
		System.out.println("Introduzca ID del fabricante a modificar");
		int ID = opcion.nextInt();
		System.out.println("Introduzca el nuevo ID");
		int ID1 = opcion.nextInt();
		System.out.println("Introduzca el nuevo CIF");
		String CIF = opcion.next();
		System.out.println("Introduzca el nuevo nombre");
		String NOMBRE = opcion.next();
		
		Statement s = (Statement) con.createStatement();

		s.executeUpdate("UPDATE `tutorialjavacoches`.`fabricante` SET `id` = " + ID1 + ", `cif` = " + CIF + ", `nombre` = "+ NOMBRE +" WHERE (`id` = " + ID + ")");
		
		s.close();
		
	}
}
		
		
