package tema6.tema6Bloque5.Ejercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class EjercicioDate {
	
	public static void ParseoDeFecha(){
	String fecha = JOptionPane.showInputDialog("Introduzca una fecha");
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
	Date fechaParseada = null;
	// El parseo de fechas debe obligatoriamente ser inspeccionado con un bloque de manejo de excepciones
	try {
		fechaParseada = sdf.parse(fecha);
	} catch (ParseException e) {
		System.out.println ("Error en el parseo de la fecha");
		e.printStackTrace();
	}
	System.out.println("Fecha parseada: " + sdf.format(fechaParseada));
	
	}
	
	public static void MostrarFecha() {
		Calendar fechaCalendar = Calendar.getInstance(); // Instanciación por patrón Factory (Recuerda como funciona)
		
		// Conversión a date y formateo
		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		System.out.println("Fecha a partir de Calendar con campos individualizados: "
				+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(fechaAPartirDeCalendar));
		
		System.out.println("Año " + fechaCalendar.get(Calendar.YEAR));
		// Sobre el mes, recuerda que Enero corresponde al valor int 0 y Diciembre al int 11. Mejor usa las variables estáticas
		System.out.println("Mes " + fechaCalendar.get(Calendar.MONTH));
		System.out.println("Dia " + fechaCalendar.get(Calendar.DAY_OF_MONTH));

		// Ejemplo de manejo de horas en formato AM/PM
		System.out.println("Hora " + fechaCalendar.get(Calendar.HOUR));

		System.out.println("Minuto " + fechaCalendar.get(Calendar.MINUTE));
		System.out.println("Segundo " + fechaCalendar.get(Calendar.SECOND));
	
		
	}
	
	public static void SumaFechas() {
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 3);
		ahora.add(Calendar.WEEK_OF_MONTH, -2);
		ahora.add(Calendar.DAY_OF_YEAR, 300);
		ahora.add(Calendar.YEAR, 4);
		System.out.println("Ahora más 3 días, 2 semanas menos, 300 dias menos, 4 años menos : " + ahora.getTime());
		
	}
	
	public static void main(String[] args) {
		ParseoDeFecha();
		MostrarFecha();
		SumaFechas();
	}
}
