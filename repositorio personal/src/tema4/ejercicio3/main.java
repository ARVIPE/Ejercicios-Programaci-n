package tema4.ejercicio3;

public class main {

    public static void main(String[] args) {
        persona nombre01 = new persona();

        nombre01.apellidos = "Vicente Per�z"; 
        nombre01.DNI = "31031987L";
        nombre01.direccion = "avenida del aeropuerto numero 2";
        nombre01.telefono = "675423398";

        nombre01.imprimeEnConsola();

        persona nombre02 = new persona();

        nombre02.apellidos = "Garc�a L�pez";
        nombre02.DNI = "47325732M";
        nombre02.direccion = "avenida conde vallellano";
        nombre02.telefono = "685423292";

        nombre02.imprimeEnConsola();


    }
}