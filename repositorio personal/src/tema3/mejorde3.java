package tema3;
import javax.swing.JOptionPane;

public class mejorde3 {
 
	public static void main(String[] args) {
        
        int aleatorio=(int)(Math.random()+1);
        int victoria = 0;
        int victoria1 = 0;


        String str = JOptionPane.showInputDialog("Introduzca cara o cruz");
        int numero = Integer.parseInt(str);
        
        for (; ; ){
        if (numero == aleatorio) {
        victoria = victoria + 1;
        str = JOptionPane.showInputDialog("demuestra quien manda");
        }else{
            victoria1 = victoria + 1;
            str = JOptionPane.showInputDialog("te va ganando un ordenador pringado");
            if (numero == aleatorio) {
            str = JOptionPane.showInputDialog("Has atinao maquina");
            victoria = victoria + 1;
            }else{
                str = JOptionPane.showInputDialog("que te gana un trozo de metal desgraciao");
                victoria1 = victoria1 + 1;
            }
            if (numero == aleatorio) {
                str = JOptionPane.showInputDialog("Has atinao maquina");
                victoria = victoria + 1;
                }else{
                    str = JOptionPane.showInputDialog("Has fallado");
                    victoria1 = victoria1 + 1;
                }
            }
            if (victoria1 == 2) {
                System.out.println("Has perdido");
                return;
            }else{
                if (victoria == 2) {
                    System.out.println("Has fallado");
                    return;
                }
            }
        }
    }
}

