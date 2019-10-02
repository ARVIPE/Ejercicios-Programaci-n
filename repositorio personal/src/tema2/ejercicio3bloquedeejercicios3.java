package tema2;

import javax.swing.JOptionPane;

public class ejercicio3bloquedeejercicios3 {

	public static void main(String[] args) {
        
        int n = 0;
        while (n != 0) {
            String str = JOptionPane.showInputDialog("Introduzca un número del 0 al 5 en función de lo que desee" +
            "1. Cálculo de la hipotenusa de un triángulo." + 
            " 2. Cálculo de la superficie de una circunferencia." +
            " 3. Cálculo del perímetro de una circunferencia." + 
            "4. Cálculo del área de un rectángulo." + 
            "5. Cálculo del área de un triángulo." +
            "0. Salir de la aplicación.");
                int num1 = Integer.parseInt(str);
            
            
                if (num1 == 0) {
                    return;
                }else{
                
                switch (num1) {
                    case 1:
                    str = JOptionPane.showInputDialog("Introduzca un cateto");
                    double primercateto = Double.parseDouble(str);

                    str = JOptionPane.showInputDialog("Introduzca otro cateto");
                    double segundocateto = Double.parseDouble(str);

                    System.out.println(Math.sqrt(Math.pow(primercateto,2)+Math.pow(segundocateto,2)));
                    break;

                    case 2:
                    str = JOptionPane.showInputDialog("Introduzca un radio");
                    double radio = Double.parseDouble(str);
                    System.out.println(Math.PI*Math.pow(radio, 2));
                    break;

                    case 3:
                    str = JOptionPane.showInputDialog("Introduzca un radio");
                    double radio1 = Double.parseDouble(str);
                    System.out.println(2*Math.PI*radio1);
                    break;

                    case 4:
                    str = JOptionPane.showInputDialog("Introduzca una base");
                    double base = Double.parseDouble(str);
                
                
                    str = JOptionPane.showInputDialog("Introduzca una altura");
                    double altura = Double.parseDouble(str);

                    System.out.println(base*altura);
                    break;

                    case 5:
                    str = JOptionPane.showInputDialog("Introduzca una base");
                    double base1 = Double.parseDouble(str);
                
                    str = JOptionPane.showInputDialog("Introduzca la altura");
                    double altura1 = Double.parseDouble(str);

                    System.out.println((base1*altura1)/2);
                    break;

                }
            }
        }
    }
}

