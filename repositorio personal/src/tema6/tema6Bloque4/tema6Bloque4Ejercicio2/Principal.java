package tema6.tema6Bloque4.tema6Bloque4Ejercicio2;

import javax.swing.JOptionPane;


public class Principal {

	private static String getOracionConBombilla() throws BombillaNoEncontrada, 
											EspaciosEnBlanco, MinimoNumeroDePalabras,
											PalabraOfensiva {
		String oracion = JOptionPane.showInputDialog("Introduzca una oración con la palabra bombilla");

		if (oracion.trim().equals("")) {
			throw new EspaciosEnBlanco("No hay palabras en la frase introducida");
		}

		String palabras[] = oracion.split("[ ]{1,}");
		if (palabras.length < 3) {
			throw new MinimoNumeroDePalabras("Introduzca al menos 3 palabras");
		}

		if (oracion.toUpperCase().indexOf("BOMBILLA") == -1) {
			throw new BombillaNoEncontrada("No se ha encontrado la palabra bombilla");
		}

		
		String palabrasOfensivas[] = new String[] { "TONTO", "TONTA", "IDIOTA" };
		for (String palabraOfensiva : palabrasOfensivas) {
			if (oracion.toUpperCase().indexOf(palabraOfensiva) != -1) {
				throw new PalabraOfensiva("Palabra " + palabraOfensiva + " encontrada");
			}
		}

		return oracion;
	}

	public static void main(String[] args) {
		try {
			System.out.println(getOracionConBombilla());
		} catch (EspaciosEnBlanco e) {
			e.printStackTrace();
		} catch (MinimoNumeroDePalabras e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BombillaNoEncontrada e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PalabraOfensiva e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
