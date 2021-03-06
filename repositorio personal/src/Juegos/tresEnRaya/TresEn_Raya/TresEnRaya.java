package Juegos.tresEnRaya.TresEn_Raya;

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
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tema4.practicaexamen.Jugador;


public class TresEnRaya extends Canvas {

	
	JFrame ventana = new JFrame("3 en Raya");


	private static final int JFRAME_WIDTH=700;
	private static final int JFRAME_HEIGHT=700;
	
	private BufferedImage ocean;
	private int t;

	List<Cuadro> cuadros = new ArrayList<Cuadro>();
	

	private static TresEnRaya instance = null;
	

	public static int JUGADOR_1 = 1;
	public static int JUGADOR_2 = 2;
	private int turnoActual = JUGADOR_1;
	int contador = 0;
	
	
	public int matrizJugadas[][] = new int[][] {{0, 0, 0},
												 {0, 0, 0},
												 {0, 0, 0}};
	

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
						if (cuadro.seHaHechoclicSobreCuadro(e.getX(), e.getY())) {
							cuadro.clic(turnoActual);
					
							if (turnoActual == JUGADOR_1) {
								
								SoundsRepository.getInstance().playSound(SoundsRepository.EFECTO_JUGADOR_1);
								comprobar_ganador(turnoActual);
								//Le he agregado un contador y le digo que si este llega a 4 y el turno es el de jugador 1
								//Entonces es que ha habido un empate
								if((contador == 4) && (turnoActual == JUGADOR_1)) {
									JOptionPane.showMessageDialog(null, "Ha habido un empate");
									System.exit(0);
								}
								turnoActual = JUGADOR_2;
								
							}
							else {
								SoundsRepository.getInstance().playSound(SoundsRepository.EFECTO_JUGADOR_2);
								comprobar_ganador(turnoActual);
								contador = contador + 1;
								System.out.println("contador = " + contador);
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
	
	
	/**
	 * 
	 */
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

		g.setColor(Color.RED);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
	
		for (Cuadro cuadro : cuadros) {
			cuadro.paint(g);
		}
	}
	
	/**
	public void paintWorld() {
		ocean = SpritesRepository.getSprite("oceano.gif");
	}**/

	
	public int[][] getMatrizJugadas() {
		return matrizJugadas;
	}

	
	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}
		
	public void comprobar_ganador(int valor_juego){
		if((matrizJugadas[0][0]==1) && (matrizJugadas[0][1]==1) && (matrizJugadas[0][2]==1)){
	    	JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
	    	System.exit(0);
	    }
		if((matrizJugadas[1][0]==1) && (matrizJugadas[1][1]==1) && (matrizJugadas[1][2]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[2][0]==1) && (matrizJugadas[2][1]==1) && (matrizJugadas[2][2]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[0][0]==1) && (matrizJugadas[1][0]==1) && (matrizJugadas[2][0]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[0][1]==1) && (matrizJugadas[1][1]==1) && (matrizJugadas[2][1]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[0][2]==1) && (matrizJugadas[1][2]==1) && (matrizJugadas[2][2]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[0][0]==1) && (matrizJugadas[1][1]==1) && (matrizJugadas[2][2]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[0][2]==1) && (matrizJugadas[1][1]==1) && (matrizJugadas[2][0]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		if((matrizJugadas[0][2]==1) && (matrizJugadas[1][2]==1) && (matrizJugadas[2][2]==1)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 1");
			System.exit(0);
		}
		/**
		 * 
		 */
		if((matrizJugadas[0][0]==2) && (matrizJugadas[0][1]==2) && (matrizJugadas[0][2]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
	    	System.exit(0);
	    }
		if((matrizJugadas[1][0]==2) && (matrizJugadas[1][1]==2) && (matrizJugadas[1][2]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[2][0]==2) && (matrizJugadas[2][1]==2) && (matrizJugadas[2][2]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[0][0]==2) && (matrizJugadas[1][0]==2) && (matrizJugadas[2][0]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[0][1]==2) && (matrizJugadas[1][1]==2) && (matrizJugadas[2][1]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[0][2]==2) && (matrizJugadas[1][2]==2) && (matrizJugadas[2][2]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[0][0]==2) && (matrizJugadas[1][1]==2) && (matrizJugadas[2][2]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[0][2]==2) && (matrizJugadas[1][1]==2) && (matrizJugadas[2][0]==2)){
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		if((matrizJugadas[0][2]==2) && (matrizJugadas[1][2]==2) && (matrizJugadas[2][2]==2)){
		    JOptionPane.showMessageDialog(null, "Ha ganado el jugador 2");
			System.exit(0);
		}
		
	
	}
}
		    	
	    
	    
	