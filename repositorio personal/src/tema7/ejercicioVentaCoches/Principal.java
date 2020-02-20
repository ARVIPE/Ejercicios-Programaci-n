package tema7.ejercicioVentaCoches;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        MenuPrincipal();
    }

    private static void MenuPrincipal(){

        
        Scanner opcion;
        int Opcion;
        
        do{
        System.out.println("Venta de Coches");
        System.out.println("Elija una opción");

        System.out.println("1) Gestion de Fabricantes");
        System.out.println("2) Gestion de ___________");
        System.out.println("3) Gestion de ___________");
        System.out.println("4) Gestion de ___________");
        System.out.println("5) Gestion de ___________");

        opcion = new Scanner(System.in);
        Opcion = opcion.nextInt();

        }while(Opcion < 6);
        
    }

}