package tema3;
import javax.swing.JOptionPane;

public class juegoadivinarnumeroalazar {
 
	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
 
		int numero=0;   
    
    for ( ;numero != aleatorio;){
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Número"));
 
		if(aleatorio<numero){
            JOptionPane.showMessageDialog(null, "Ingrese Número mas bajo");

        }else{
                    if(aleatorio>numero){
                    JOptionPane.showMessageDialog(null, "Ingrese Número mas alto");

        
                    }
                }
            }
        JOptionPane.showMessageDialog(null, "Enhorabuena has acertado el número");
	}
}
