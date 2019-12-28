package ejercicio3enRayas;

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


public class TresEnRaya extends Canvas {


	JFrame ventana = new JFrame("3 en Raya");

	// Indicamos alto y ancho del objeto tipo Canvas
	private static final int JFRAME_WIDTH=700;
	private static final int JFRAME_HEIGHT=700;	
	

	List<Cuadro> cuadros = new ArrayList<Cuadro>();
	

	private static TresEnRaya instance = null;
	
	// Control sobre el turno de cada jugador
	public static int JUGADOR_1 = 1;
	public static int JUGADOR_2 = 2;
	private int turnoActual = JUGADOR_1;
	

	private int matrizJugadas[][] = new int[][] {{0, 0, 0},
												 {0, 0, 0},
												 {0, 0, 0}};
	
	
	/**
	 * Constructor, inicializa y monta la ventana
	 */
	public TresEnRaya() {
	
		SoundsRepository.getInstance();
		SpritesRepository.getInstance();
		
		
		JPanel panel = (JPanel) ventana.getContentPane();
		
		panel.setLayout(new BorderLayout());
		
		panel.add(this, BorderLayout.CENTER);

		ventana.setBounds(0,0, JFRAME_WIDTH, JFRAME_HEIGHT);
		
		
		inicializaCuadrosDelTablero();
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
			
				if (e.getButton() == MouseEvent.BUTTON1) {
					for (Cuadro cuadro : cuadros) {
						if (cuadro.seHaHechoclicSobreElCuadro(e.getX(), e.getY())) {
							cuadro.clic(turnoActual);
						
							if (turnoActual == JUGADOR_1) {
						
								SoundsRepository.getInstance().playSound(SoundsRepository.EFECTO_JUGADOR_1);
								
								turnoActual = JUGADOR_2;
							}
							else {
							
								SoundsRepository.getInstance().playSound(SoundsRepository.EFECTO_JUGADOR_2);
								// Cambio el turno
								turnoActual = JUGADOR_1;
							}
						}
					}
				}
			}
		});
		

		SoundsRepository.getInstance().loopSound(SoundsRepository.MUSICA_DE_FONDO);
		
		
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
	 * M�todo para devolver la instancia del patr�n Singleton
	 * @return
	 */
	public static TresEnRaya getInstance () {
		if (instance == null) {
			instance = new TresEnRaya();
		}
		return instance;
	}
	
	
	private void inicializaCuadrosDelTablero() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.cuadros.add(new Cuadro(j, i));
			}
		}
	}
	

	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"�Desea cerrar la aplicaci�n?","Salir de la aplicaci�n",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
	
		for (Cuadro cuadro : cuadros) {
			cuadro.paint(g);
		}
	}

	
	public int[][] getMatrizJugadas() {
		return matrizJugadas;
	}

	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}

}