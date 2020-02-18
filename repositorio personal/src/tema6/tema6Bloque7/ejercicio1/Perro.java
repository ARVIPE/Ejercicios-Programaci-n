package tema6.tema6Bloque7.ejercicio1;

public class Perro implements PalabraMagicaIntroducidaListener{

	String nombre;
	
	public Perro (String nombre) {
		this.nombre = nombre;
		TresDigitosIntroducidos.addPalabraMagicaIntroducidaListener(this);
	}
	
	@Override
	public void palabraMagicaIntroducida(PalabraMagicaIntroducidaEvent event) {
		System.out.println("Soy " + this.nombre + " y he escuchado la palabra: " + event.getPalabraIntroducida());
	}

}
