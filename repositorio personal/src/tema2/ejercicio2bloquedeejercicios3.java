package tema2;

import javax.swing.JOptionPane;

public class ejercicio2bloquedeejercicios3 {
    public static void main(String[] args) {

        String str = JOptionPane.showInputDialog("Introduzca 1 si quiere hacer raices.\nIntroduzca 2 si quiere hacer potencias,\nIntroduzca 3 si quiere calcular el resto de una división. \n ");
        int caso = Integer.parseInt(str);

        
		switch (caso) {
            case 1:
            str = JOptionPane.showInputDialog("Introduzca base de la raíz");
            double base = Double.parseDouble(str);
            

            str = JOptionPane.showInputDialog("Introduzca un exponente");
            double exponente = Double.parseDouble(str);
            
            
            System.out.println("El resultado es:");
            System.out.println(Math.pow(base, (1/exponente)));
            break;

            case 2:
            str = JOptionPane.showInputDialog("Introduzca una base");
            double base1 = Double.parseDouble(str);
            

            str = JOptionPane.showInputDialog("Introduzca un exponente");
            double exponente1 = Double.parseDouble(str);
            

            System.out.println("El resultado es:");
            System.out.println(Math.pow(base1, exponente1));
            break;
            case 3:
            str = JOptionPane.showInputDialog("Introduzca un dividendo");
            double dividendo = Double.parseDouble(str);

            str = JOptionPane.showInputDialog("Introduzca un divisor");
            double divisor = Double.parseDouble(str);
            
            System.out.println("El resultado es:");
            System.out.println(dividendo % divisor);
            break;



        }
    }
}