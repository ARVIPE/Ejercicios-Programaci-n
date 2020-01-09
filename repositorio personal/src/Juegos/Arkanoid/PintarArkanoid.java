package Juegos.Arkanoid;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Juegos.formula1Juego.formula1Juego.Formula1;
import Juegos.formula1Juego.formula1Juego.SoundRepository;

public class PintarArkanoid extends Canvas {
	
	//Le ponemos el nombre a nuestra ventana
	JFrame ventana = new JFrame("Arkanoid");
	//Indicamos las dimensiones de la ventana
	protected static final int JFRAME_WIDTH=700;
	protected static final int JFRAME_HEIGHT=700;
	
	//Inicializamos la instancia
	private static PintarArkanoid instance = null;
	
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"¿Desea cerrar la aplicación?","Salir de la aplicación",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	
	
}



