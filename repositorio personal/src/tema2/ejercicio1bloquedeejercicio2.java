package tema2;

import javax.swing.JOptionPane;

public class ejercicio1bloquedeejercicio2 {

    public static void main(String[] args) {
   	 
    
   	 int acNegativos = 0;
   	 int acBajos = 0;
   	 int acMedios = 0;
   	 int acAltos = 0;
   	 
   	 String str = JOptionPane.showInputDialog("Introduce un número ");
   	 int a = Integer.parseInt(str);
   	 System.out.println("Has introducido el número: " + a);
   	 
   	 if (a < 0) { // Si es negativo lo acumulo correctamente
   		 acNegativos +=a;
   		 ;
   	 }else {
   		 if (a < 25) {
   			 acBajos += a;
   		 }else {
   			 if (a < 250) {
   				 acMedios += a;
   			 }else {
   				 acAltos += a;
   				 
   			 }
   		 }
   	 }
   	 
    	str = JOptionPane.showInputDialog("Introduce un número ");
   	 int b = Integer.parseInt(str);
   	 System.out.println("Has introducido el número: " + b);
   	 
   	 if (b < 0) { // Si es negativo lo acumulo correctamente
   		 acNegativos +=b;
   		 
   	 }else {
   		 if (b < 25) {
   			 acBajos += b;
   		 }else {
   			 if (b < 250) {
   				 acMedios += b;
   			 }else {
   				 acAltos += b;
   				 
   			 }
   		 }
   	 }
   	 
   	 str = JOptionPane.showInputDialog("Introduce un número ");
   	 int c = Integer.parseInt(str);
   	 System.out.println("Has introducido el número: " + c);
   	 
   	 if (c < 0) { // Si es negativo lo acumulo correctamente
   		 acNegativos +=c;
   		 ;
   	 }else {
   		 if (c < 25) {
   			 acBajos += c;
   		 }else {
   			 if (c < 250) {
   				 acMedios += c;
   			 }else {
   				 acAltos += c;
   				 
   			 }
   		 }
   	 }
   	 
   	 str = JOptionPane.showInputDialog("Introduce un número ");
   	 int d = Integer.parseInt(str);
   	 System.out.println("Has introducido el número: " + d);
   	 
   	 if (d < 0) { // Si es negativo lo acumulo correctamente
   		 acNegativos +=d;
   		 ;
   	 }else {
   		 if (d < 25) {
   			 acBajos += d;
   		 }else {
   			 if (d < 250) {
   				 acMedios += d;
   			 }else {
   				 acAltos += d;
   				 
   			 }
   		 }
   	 }
   	 
   	 str = JOptionPane.showInputDialog("Introduce un número ");
   	 int e = Integer.parseInt(str);
   	 System.out.println("Has introducido el número: " + e);
   	 
   	 if (e < 0) { // Si es negativo lo acumulo correctamente
   		 acNegativos +=e;
   		 ;
   	 }else {
   		 if (e < 25) {
   			 acBajos += e;
   		 }else {
   			 if (e < 250) {
   				 acMedios += e;
   			 }else {
   				 acAltos += e;
   				 
   			 }
   		 }
   	 }
   	 // Finalmente presento los resultados al usuario
   	 System.out.println("Acumulador números negativos: " + acNegativos);
   	 System.out.println("Acumulador números bajos: " + acBajos);
   	 System.out.println("Acumulador números medios: " + acMedios);
   	 System.out.println("Acuulador números altos: " + acAltos);

    }

}




   	 
