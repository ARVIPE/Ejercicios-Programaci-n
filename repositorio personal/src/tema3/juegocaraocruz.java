package tema3;
import javax.swing.JOptionPane;

public class juegocaraocruz {
 
	public static void main(String[] args) {
        
        int aleatorio=(int)(Math.random()+1);
        

        String str = JOptionPane.showInputDialog("Introduzca cara o cruz");
        int numero = Integer.parseInt(str);
        
        if (numero == aleatorio) {
            System.out.println("Has acertado");
        }else{
            System.out.println("Has fallao pringao");
        
            
        }
        System.out.println("Has acertado");
    
    }
}