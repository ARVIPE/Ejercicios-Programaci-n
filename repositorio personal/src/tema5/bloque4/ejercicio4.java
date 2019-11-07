package tema5.bloque4;

public class ejercicio4 {

  public static void main(String[] args) {

    int matriz[][] = new int[5][5];
    int x = 0;
    int y = 0;

    for (x = 0; x < matriz.length; x++) {
      for (y = 0; y < matriz[x].length; y++) {
        matriz[x][y] = (int) (Math.random() * (10 - -10) + -10);
      }
    }

    for (x = 0; x < matriz.length; x++) {
      for (y = 0; y < matriz.length; y++) {

        System.out.print(matriz[x][y] + "\t");
      }
      System.out.println();
    }

    // Comprobamos si la matríz es positiva
    boolean esPositiva = esMatrizPositiva(matriz);
    if (esPositiva) {
      System.out.println("La matríz es positiva");
    }else{
      System.out.println("La matríz no es positiva");
    }
    // Comprobamos si la matríz es diagonal
    boolean esDiagonal = esMatrizDiagonal(matriz);
    if (esDiagonal) {
      System.out.println("La matríz es diagonal");
    }else{
      System.out.println("La matríz no es diagonal");
    }
    boolean esSuperior = esMatrizSuperior(matriz);
    if (esSuperior) {
      System.out.println("La matríz es superior");
    }else{
      System.out.println("La matríz no es superior");
    }

  }

  private static boolean esMatrizPositiva (int matriz[][]) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] < 0) { // Hay un elemento negativo, la matriz no es positiva
          return false;
        }
      }
    }
    return false;
  }
  private static boolean esMatrizDiagonal (int matriz[][]) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (i != j && matriz[i][j] != 0) { 
          return false;
        }
      }
    }
    return false;
  }
  private static boolean esMatrizSuperior (int matriz[][]) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        //Compruebo si hay un elemento de la mitad debajo de la diagonal principal
        //que sea distinto de cero
        //Todos los elementos debajo de esa diagonal principal, cumple la condicion de que i > j
        if (i > j && matriz[i][j] != 0) { 
          return false;
        }
      }
    }
    return false;
  }  

}
