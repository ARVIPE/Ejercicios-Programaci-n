package tema4.ejercicio3;

public class persona {

    String nombre;
    String apellidos;
    public String DNI;
    public	String direccion;
    public String telefono;
    

   /**
    * 
    */
    public void imprimeEnConsola () {
        System.out.println("Persona: nombre" + nombre + " - apellidos: " +
        apellidos + " - DNI: " + DNI + " - direccion: " + direccion + " - telefono: " + telefono);
    }

}