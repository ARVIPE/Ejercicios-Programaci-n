package formula1Juego.formula1Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.java2d.loops.FillRect;
import tresEnRaya.TresEn_Raya.Cuadro;
import tresEnRaya.TresEn_Raya.SoundsRepository;
import tresEnRaya.TresEn_Raya.SpritesRepository;
import tresEnRaya.TresEn_Raya.TresEnRaya;


public class Formula1 extends Canvas {

	Carrera carrera1 = new Carrera();
	//Le ponemos el nombre a nuestra ventana
	JFrame ventana = new JFrame("Formula 1");
	//Indicamos las dimensiones de la ventana
	protected static final int JFRAME_WIDTH=1000;
	protected static final int JFRAME_HEIGHT=400;	
	
	
	// Variable para establecer la instancia del patrón singleton
	private static Formula1 instance = null;
	
	public Formula1() {

		
		SoundRepository.getInstance();

		JPanel panel = (JPanel) ventana.getContentPane();
		
		panel.setLayout(new BorderLayout());
	
		panel.add(this, BorderLayout.CENTER);
	
		ventana.setBounds(0,0, JFRAME_WIDTH, JFRAME_HEIGHT);
		
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				//Le decimos que cuando haga clic izquierdo avance
				if (e.getButton() == MouseEvent.BUTTON1) {
						Carrera.avanzar();
						Formula1.getInstance().repaint();
						Formula1.getInstance().revalidate();
		
					}
				}
		});
		//Agregamos sonidos
		SoundRepository.getInstance().loopSound(SoundRepository.MUSICA_DE_FONDO_FORMULA1);
		
	
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		
		});
		
		ventana.setVisible(true);
	
		this.requestFocus();

	}
	//Ejecutamos nuestro patron singleton
	/**
	 * @return
	 */
	public static Formula1 getInstance () {
		if (instance == null) {
			instance = new Formula1();
		}
		return instance;
	}
	
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"¿Desea cerrar la aplicación?","Salir de la aplicación",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public Carrera getCarrera1() {
		return carrera1;
	}
	public void setCarrera1(Carrera carrera1) {
		this.carrera1 = carrera1;
	}
	
	public static void main(String[] args) {
		Formula1.getInstance();
	}
	
	public void paint(Graphics g){
		g.drawRect(0, 0, 1000, 100);
		g.drawRect(0, 100, 1000, 100);
		g.drawRect(0, 200, 1000, 100);
		g.drawRect(0, 300, 1000, 100);
	}
	

	
	
}
