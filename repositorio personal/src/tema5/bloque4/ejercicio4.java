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

}
