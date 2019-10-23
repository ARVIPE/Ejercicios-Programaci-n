package tema5.bloque2;



public class ordenarparesconpareseinparesconinpares {

	public static void main(String[] args) {
    
       int array[] = new int [10];
        int i;
        int indiceimpar = 0;
        int[] impares;
        int[] pares;
        int indicepar = 0;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * (5));
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
      
            for (i= 0; i < array.length; i++) {
            if(array[i]%2 != 0){
            
				
				impares[indiceimpar] = array[i];
                indiceimpar++;
            }
            for (i = 0; i < array.length; i++) {
                if(array[i]%2 == 0){
                   
                    pares[indicepar] = array[i];
                    indicepar++;
                }
            }
        }
        System.out.println(pares[indicepar]);
    }
}
          
           
    
    
    

