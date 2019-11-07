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
    //Comprobamos si la matríz es superior
    boolean esSuperior = esMatrizSuperior(matriz);
    if (esSuperior) {
      System.out.println("La matríz es superior");
    }else{
      System.out.println("La matríz no es superior");
    }
    //Comrpobamos si la matriz es dispersa
    boolean esDispersa = esMatrizDispersa(matriz);
    if (esDispersa) {
      System.out.println("La matríz es dispersa");
    }else{
      System.out.println("La matríz no es dispersa");
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
  private static boolean esMatrizDispersa (int matriz[][]) {
    //Voy a comprobar si todas las filas tienen al menos un elemento
    //igual a cero
    for (int i = 0; i < matriz.length; i++) {
      //La i me recorre todas las filas
      //Con un bucle de j recorro todos los elementos de cada fila
      boolean noHayCeros = true;
      for (int j = 0; j < matriz[i].length; j++) {
          if(matriz[i][j] == 0) { // En la fila i o en la j hay al menos un cero
            noHayCeros = false;
          }
        
          if (noHayCeros == true) {
            return false;
          }
        
        
        //Si llegamos hasta aquí, es porque hemos comprobado todas las filas
        //y todas las columnas, y todas ellas tienen al menos un elemento igual
        //a cero.
      }
     
    }
    
  }  
}  


