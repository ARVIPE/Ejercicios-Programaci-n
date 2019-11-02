package tema5.bloque4;

public class ejercicio4 {

	public static void main(String[] args) {
        
        int matriz[][] = new int[5][5];
        int x = 0;
        int y = 0;
        
        for (x=0; x < matriz.length; x++) {
            for (y=0; y < matriz[x].length; y++) {
              matriz[x][y] = (int) (Math.random()* (10 - -10) + -10);
            }
          }
        
        for(x = 0; x < matriz.length; x++) {
        	for(y = 0; y < matriz.length; y++) {
        
        	System.out.print(matriz[x][y] + "\t");
        	}
        	System.out.println();
        }
        
        if(matriz[x][y] >= 0) {
        	System.out.println("La matríz es positiva");
        }else {
        	System.out.println("La matríz no es positiva");
        }
        
        

    }
}
