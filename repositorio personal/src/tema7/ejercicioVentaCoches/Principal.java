package tema7.ejercicioVentaCoches;

import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class Principal {
	
	static Connection con = null;

    public static void main(String[] args) throws SQLException{
        MenuPrincipal();
    }

    public static void MenuPrincipal() throws SQLException{

        
        Scanner opcion = new Scanner(System.in);
        int Opcion;
        
        do{
        System.out.println("Venta de Coches");
        System.out.println("Elija una opción");

        System.out.println("1) Gestion de Fabricantes");
        System.out.println("2) Gestion de ___________");
        System.out.println("3) Gestion de ___________");
        System.out.println("4) Gestion de ___________");
        System.out.println("5) Gestion de ___________");
        System.out.println("0) Finalizar programa");

        Opcion = opcion.nextInt();
        
        if(Opcion == 0) {
        	System.out.println("El programa ha finalizado");
        	break;
        }
        if(Opcion == 1) {
        	GestionDeFabricantes.menuGestionDeFabricantes(con);
        }

        }while(Opcion > 1);
        if(Opcion != 0) {
        	System.out.println("El programa ha finalizado");
        }
    }

}