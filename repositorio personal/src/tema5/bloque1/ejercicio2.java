package tema5.bloque1;


public class ejercicio2 {

    public static void main(String[] args) {
        int numeros [] = new int [150];

    // Inicializamos el contenido del array
            for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) Math.round(Math.random() * 100);
    
            //imprimir en la consola el array creado
            for (i = 0; i < numeros.length; i++){
                System.out.println(numeros[i] + "");


            }

            //Muestro el array en orden inverso
            for (i = numeros.length - 1; i > -1; i--) {
                System.out.println(numeros[i] + "");
            }
        }
    }
}
