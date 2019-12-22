package formula1Juego.formula1Juego;
import java.util.ArrayList;
import java.util.List;

public class Carrera extends Obstaculo{
	
	Vehiculo vehiculo1 = new Coche("Fran");
	Vehiculo vehiculo2 = new Coche("Ana");
	Vehiculo vehiculo3 = new Coche("Medina");
	Vehiculo vehiculo4 = new Coche("Nuria");
	
	static List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public Carrera(String nombre) {
		super(nombre);
		vehiculos.add(vehiculo1);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo3);
		vehiculos.add(vehiculo4);
	}

	public static void avanzar() {
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).tirada();
			System.out.println(vehiculos.get(i).getNombre() + " " + "posicion: " + vehiculos.get(i).getPosicion());
		}
	}

	public boolean FinDeJuego() {
		for(int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getPosicion()>=100) {
				System.out.println("Ha ganado el vehiculo: " + vehiculos.get(i).getNombre());
				return true;
			}
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		return false;
	}
}


