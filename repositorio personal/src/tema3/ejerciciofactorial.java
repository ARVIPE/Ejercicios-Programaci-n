package tema3;


public class ejerciciofactorial {

public static void main(String[] args) {
    
    System.out.println ("Introduzca el n�mero cuyo factorial desea conocer: ");
    int factorial = Utils.obtenerEntero();
    
        for (int i = factorial-1; i > 1; i--) {
            factorial = factorial * i;
        }
    
        System.out.println("El valor del factorial equivale a " + factorial);
    }
}
