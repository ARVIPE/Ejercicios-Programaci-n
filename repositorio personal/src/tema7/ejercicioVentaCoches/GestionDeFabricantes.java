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
		System.out.println("1) Listado de fabricantes.");
		System.out.println("2) Alta de fabricante.");
		System.out.println("3) Modificación de fabricante.");
		System.out.println("4) Baja de fabricante.");
		System.out.println("5) Salir");
		
		Opcion = opcion.nextInt();
		
		if(Opcion == 5) {
			break;
		}
	
		
        }while((Opcion > 1) && (Opcion <= 6));
        
        if(Opcion == 1) {
        	ListadoDeFabricantes(con);
        }
        
        if(Opcion == 2) {
        	
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
		
		System.out.println("Introduzca el id del fabricante");
	    Scanner ID = new Scanner(System.in);
		// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
		// Statement
		Statement s = (Statement) con.createStatement();

		// La ejecución de la consulta se realiza a través del objeto Statement y se
		// recibe en forma de objeto
		// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
		// obtenidos por la consulta
		ResultSet rs = s.executeQuery("INSERT INTO `tutorialjavacoches`.`fabricante` (`id`, `cif`, `nombre`) VALUES (ID, '21212194H', 'Renault');\r\n" + 
				"");

		// Navegación del objeto ResultSet
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString(2) + " " + rs.getString(3));
		}

	}

}
