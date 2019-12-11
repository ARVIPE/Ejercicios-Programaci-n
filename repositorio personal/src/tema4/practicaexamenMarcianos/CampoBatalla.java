package tema4.practicaexamenMarcianos;

import tutorialJava.Examenes.Examen20181217_JavaPrimeraEvaluacion_Recuperacion.solucion.Personaje;

public class CampoBatalla {
	
	
	private String nombre;
	private Humano humanos[] = new Humano[20];
	private Malvado malvados[] = new Malvado[20];
	
	
	public CampoBatalla(String nombre) {
		super();
		this.nombre = nombre;
		
		
		for(int i = 0; i < 20; i++) {
			humanos[i] = new Humano("-Hum " + i);
			malvados[i] = new Malvado("-Malv " + i);
			
		}
		
		//Doblamos los puntos de vida del último elemento
		humanos[humanos.length-1].doblarPuntosDeVida();
		malvados[malvados.length-1].doblarPuntosDeVida();
		
		//Mezclamos cada uno de los arrays respectivamente
		mezclar(humanos);
		mezclar(malvados);
	}
	
	//Mezclamos los arrays
	public void mezclar(Personaje array[]) {
		for (int i = 0; i <= 20; i++) {
			final int indice1 = (int) Math.round(Math.random() * (array.length - 1));
			final int indice2 = (int) Math.round(Math.random() * (array.length - 1));

			final Humano aux = humanos[indice1];
			humanos[indice1] = humanos[indice2];
			humanos[indice2] = aux;

		}

	}
	
	public boolean esFinDeJuego () {

		boolean humanosVivos = quedanElementosVivosEnArray(humanos);
		boolean malvadosVivos = quedanElementosVivosEnArray(malvados);		
		
		if (!malvadosVivos || !humanosVivos) {
			return true;
		}
		return false;
	}
	

	
	
	public boolean quedanElementosVivosEnArray (Personaje array[]) {
		if (getPrimerElementoVivoEnArray(array) != null) {
			return true;
		}
		return false;
	}
	
	
	public Personaje getPrimerElementoVivoEnArray (Personaje array[]) {
		for (Personaje p : array) {
			if (p.isVivo()) {
				return p;
			}
		}		
		return null;
	}
	
	
	
	
	
	
	public Humano[] getHumanos() {
		return humanos;
	}


	public void setHumanos(Humano[] humanos) {
		this.humanos = humanos;
	}


	public Malvado[] getMalvados() {
		return malvados;
	}


	public void setMalvados(Malvado[] malvados) {
		this.malvados = malvados;
	}
	
	
	

	
	
	
	

}
