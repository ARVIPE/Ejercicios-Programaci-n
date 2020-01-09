package formula1Juego.formula1Juego;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Carrera {
	
	public static List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	Vehiculo vehiculo1 = new Coche("Fran", 0, Color.red);
	Vehiculo vehiculo2 = new Coche("Ana", 1, Color.green);
	Vehiculo vehiculo3 = new Coche("Nuria", 2, Color.blue);
	Vehiculo vehiculo4 = new Coche("Medina", 3, Color.yellow);
	
	

	public Carrera() {

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

	public static boolean FinDeJuego() {
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

	public Vehiculo getVehiculo1() {
		return vehiculo1;
	}

	public void setVehiculo1(Vehiculo vehiculo1) {
		this.vehiculo1 = vehiculo1;
	}

	public Vehiculo getVehiculo2() {
		return vehiculo2;
	}

	public void setVehiculo2(Vehiculo vehiculo2) {
		this.vehiculo2 = vehiculo2;
	}

	public Vehiculo getVehiculo3() {
		return vehiculo3;
	}

	public void setVehiculo3(Vehiculo vehiculo3) {
		this.vehiculo3 = vehiculo3;
	}

	public Vehiculo getVehiculo4() {
		return vehiculo4;
	}

	public void setVehiculo4(Vehiculo vehiculo4) {
		this.vehiculo4 = vehiculo4;
	}

	public static List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public static void setVehiculos(List<Vehiculo> vehiculos) {
		Carrera.vehiculos = vehiculos;
	}

	
	
}


