package formula1Juego.formula1Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
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

import Juegos.juegoCarrera.PintaCarrera;
import Juegos.juegoCarrera.Vehiculo;
import tresEnRaya.TresEn_Raya.Cuadro;
import tresEnRaya.TresEn_Raya.SoundsRepository;
import tresEnRaya.TresEn_Raya.SpritesRepository;
import tresEnRaya.TresEn_Raya.TresEnRaya;


public class Formula1 extends Canvas {

	Carrera carrera1 = new Carrera();
	
	JFrame ventana = new JFrame("Formula 1");

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
			
				if (e.getButton() == MouseEvent.BUTTON1) {
						Carrera.avanzar();
						Formula1.getInstance().repaint();
						Formula1.getInstance().revalidate();
					}
				}
		});

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
	/**
	 * Sobreescribo el método "paint" del Canvas, para que cada vez que el SO o la
	 * máquina decida repintarlo, nosotros decidamos qué se va a pintar en la
	 * pantalla
	 */
	@Override

	public void paint(Graphics g) {
		Font monoFont = new Font("Monospaced", Font.BOLD | Font.ITALIC, 36);
		// Pinto un rectángulo tan grande como las dimensiones del Canvas para pintar las pistas
		super.paint(g);
		g.setColor(Color.DARK_GRAY);
		// g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.fillRect(0, 0, PintaCarrera.getJframeWidth(), PintaCarrera.getJframeHeight());

		// Aqui vamos a recorrer el ArrayList y pintar cada uno de los vehiculos
		for (Vehiculo vehiculo : carrera1.vehiculos) {
			vehiculo.paint(g);
		}

		if (Carrera.FinDeJuego()) {
			SoundRepository.getInstance().playSound(SoundRepository.MUSICA_DE_FONDO_FORMULA1);
			g.setColor(Color.CYAN);
			g.fillRect(0, 0, 1000, 400);
			g.setColor(Color.white);
			g.fillRect(200, 400 - 120, 200, 120);
			g.fillRect(400, 400 - 150, 200, 150);
			g.fillRect(600, 400 - 130, 200, 130);
			g.setColor(Color.black);
			g.drawRect(200, 400 - 120, 200, 120);
			g.drawRect(400, 400 - 150, 200, 150);
			g.drawRect(600, 400 - 130, 200, 130);

			g.setFont(monoFont);
			FontMetrics fm = g.getFontMetrics();
			int w = fm.stringWidth("2");
			int h = fm.getAscent();
			g.setColor(Color.BLACK);
			g.drawString("3", 300 - (w / 2), 320 + (h / 4));
			g.drawString("1", 500 - (w / 2), 320 + (h / 4));
			g.drawString("2", 700 - (w / 2), 320 + (h / 4));
			
			carrera1.podium.get(0).setPosicion(47);
			carrera1.podium.get(0).setDistanciaDeLaPista(175);
			carrera1.podium.get(0).pintarVehiculo(g);
			
			carrera1.podium.get(1).setPosicion(70);
			carrera1.podium.get(1).setDistanciaDeLaPista(187);
			carrera1.podium.get(1).pintarVehiculo(g);
			
			carrera1.podium.get(2).setPosicion(30);
			carrera1.podium.get(2).setDistanciaDeLaPista(197);
			carrera1.podium.get(2).pintarVehiculo(g);
			
			carrera1.podium.get(3).setPosicion(85);
			carrera1.podium.get(3).setDistanciaDeLaPista(320);
			carrera1.podium.get(3).pintarVehiculo(g);
		
				
			
		}
	}
	

	
	
}
