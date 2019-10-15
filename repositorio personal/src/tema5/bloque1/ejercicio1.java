package tema5.bloque1;

import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main(String[] args) {
        int limiteInf, limiteSup;
        int numeros [] = new int [150];

        //Petición de límites al usuario
        limiteInf = Integer.parseInt(JOptionPane.showInputDialog("Introduzca límite inferior"));
        limiteSup = Integer.parseInt(JOptionPane.showInputDialog("Introduzca límite superior"));

    // Inicializamos el contenido del array
        for (int i = 0; i < numeros.length; i++){
        numeros[i] = (int) Math.round(Math.random() * (limiteSup - limiteInf) + limiteInf);
        }
    
        //imprimir en la consola el array creado
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + "");
        }


    }
}


