package tema6.tema6Bloque5.Ejercicio2;

import java.util.Calendar;
import java.util.TimeZone;

public class DiferenciaHoraria {
	
	private static void ejemploZonasHorarias () {
		Calendar ahoraEnItalia = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar ahoraEnAustralia = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
		System.out.println("Hora Roma: " + ahoraEnItalia.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora Sydney: " + ahoraEnAustralia.get(Calendar.HOUR_OF_DAY));
		
		
		int diferenciaDeHora = (ahoraEnItalia.get(Calendar.HOUR_OF_DAY) - ahoraEnAustralia.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("La diferencia horaria es de: " + diferenciaDeHora + " horas");
	}
	
	public static void main(String[] args) {
		ejemploZonasHorarias();
	}

}
