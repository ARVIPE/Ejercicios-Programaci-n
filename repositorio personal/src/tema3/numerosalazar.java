package tema3;

public class numerosalazar {

	public static void main(String[] args) {
        //generar 1000 numeros al azar entre 0-1000 y hallar el mayor, menor, la suma y la media
        int suma = 0; i, mayor = -1;
        for (int i = 0; i < 1001; i++) {
      
        int aleatorio=(int)(Math.random()*1000);
        
            if (i == 0){
                mayor = aleatorio;
                menor = aleatorio;
            }
            else{
                if (aleatorio > mayor) mayor = aleatorio;
                if (aleatorio < menor) menor = aleatorio;
            }
        
    
     
        
        }
    }
}