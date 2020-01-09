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
	protected List <Vehiculo> podium = new ArrayList<Vehiculo>();
	private List <Integer> dimensionTacometro = new ArrayList <Integer>();
	
	

	public Carrera() {
		
		vehiculos.add(vehiculo1);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo3);
		vehiculos.add(vehiculo4);
	}
	public void imprimirPodium () {
		System.out.println(podium.toString());
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
	
	/**
	 * Ordena el ArrayList del tacómetro, que marca los turnos que ha necesitado para acabar la carrera
	 */
	public void podium (){
		int menorValor;
		//recorro la lista de vehículos para poder sacar el tamaño de los tacometros, y con ella 
		//hacer los valores en la lista de dimensión del tacómetro, así creo mi lista
		for (int i = 0; i < vehiculos.size(); i++) {
			dimensionTacometro.add(getVehiculos().get(i).tacometro.size());
			
		}
		
		boolean hayIntecambios;
		do {
			hayIntecambios = false;
			
			for (int j = 0; j < dimensionTacometro.size() - 1; j++) {	
				
				if (dimensionTacometro.get(j+1) < dimensionTacometro.get(j)) {
					menorValor = dimensionTacometro.get(j+1);
					dimensionTacometro.add(j+1, dimensionTacometro.get(j));
					dimensionTacometro.add(j, menorValor);
					hayIntecambios = true;
					
				}
			}
			
		} while (hayIntecambios);
		
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


