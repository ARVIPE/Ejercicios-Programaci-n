package tema5.bloque1;

import javax.swing.JOptionPane;

public class ejercicio3 {

    public static void main(String[] args) {

    int array [] = new int[150];

    //Inicializamos el array
    for (int i = 0; i < array.length; i++) {
        array [i] =  (int) Math.round(Math.random() * 100);
    }

    //Mostramos el array
    for (int i = 0;i < array.length; i++){
        System.out.print(array[i]);


    //Pedir número al usuario
    int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));

    //Buscar el número del usuario
        for (i = 0; i < array.length; i++){
            if (numeroBuscado == array[i]) {
                System.out.println("He encontrado el número " + numeroBuscado + " en posición " + i);
                }else{
                    System.out.println("El número buscado no se encuentra");
                }
            }
        }


        
    }
}
                    
                                