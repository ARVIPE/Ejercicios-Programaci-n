package practicaexamen.matrices;


public class pruebamatrices{

	public static void main(String[] args) {

        int matriz[][] = new int[3][3];
    
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

        System.out.println();
        


        for (x = 0; x < matriz.length; x++) {
            for (y = 0; y < matriz.length; y++) {
                
                int aux = matriz[x][0];
                matriz[x][0] = matriz[x][matriz.length-1];
                matriz[x][matriz.length-1] = aux;
                
                
                    

            System.out.print(matriz[x][y] + "\t");
                
            }
            System.out.println();
        }


    }
}
          
        

  
        
    
