import javax.swing.JOptionPane;

public class ejercicio1perocon3variablestema2 {
    
    public static void main(String[] args) {
   	 String str = JOptionPane.showInputDialog("Introduzca un n�mero:");
   	 int a = Integer.parseInt(str);
   	 
   	 str = JOptionPane.showInputDialog("Introduzca otro n�mero: ");
   	 int b = Integer.parseInt(str);
   	 
   	 str = JOptionPane.showInputDialog("Introduzca otro numero m�s: ");
   	 int c = Integer.parseInt(str);
   	 
   	 if (a == b && b == c) {
   		 System.out.println("Los tres números son iguales");
   	 }
   		 else{
   	 		
   	 }if ((a > b ) && (a > c)) {
   		 System.out.println("El n�mero mayor es: " + a);
   		 
   	 }else{
   	 }if (b > c) {
   			 
   		 System.out.println("El n�mero mayor es: "+ b);
   		 
   	 }else{System.out.println("El n�mero mayor: " + c);
   	 
   	 }
    }
}

   		 
   	 

   	 
