package Juegos.Arkanoid.Codigo;

import java.awt.Canvas;		
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arkanoid extends Canvas {
	// Indicamos alto y ancho del objeto tipo Canvas
	public static final int WIDTH = 520;
	public static final int HEIGHT = 700;
	private static Arkanoid instance = null;
	public List <Objeto> objetos = new ArrayList<Objeto>();
	Pelota pelota = new Pelota();
	Nave nave = null;

	
	// Velocidad de los fotogramas, en concreto este indica que el proceso de redibujado dormirá 10 millis
	// tras haber repintado la escena
	public static final int SPEED_FPS=60;
	
	// BufferStrategy usado para conseguir la técnica de doble búffer
	public BufferStrategy strategy;
	private long usedTime; // Tiempo usado en cada iteración del bucle principal del juego.
	public HashMap sprites;
	public int posX,posY,vX;
	
	public Arkanoid() {
		sprites = new HashMap();
		posX = WIDTH/2;
		posY = HEIGHT/2;
		vX = 2;
	
		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,WIDTH,HEIGHT);
		panel.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		this.setIgnoreRepaint(true);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		this.requestFocus();
	}
	
	public BufferedImage loadImage(String nombre) {
		URL url=null;
		try {
			url = getClass().getResource(nombre);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0);
			return null;
		}
	}
	
	public BufferedImage getSprite(String nombre) {
		BufferedImage img = (BufferedImage)sprites.get(nombre);
		if (img == null) {
			img = loadImage("../res/"+nombre);
			sprites.put(nombre,img);
		}
		return img;
	}
	
	public void paintWorld() {
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0,0,getWidth(),getHeight());
		//BufferedImage nave = loadImage("../res/nave-50x15.png");
		//g.drawImage(nave, 230, 600, null);
		for (Objeto ladrillo : objetos) {			
			ladrillo.paint(g);
		}	
		nave.paint(g);
		pelota.paint(g);
		strategy.show();

	
	}
	
	private void initWorld() {
		int CoordenadaX = 20;
		int CoordenadaY = 30;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.blue);
			ladrillo.setxCoord(CoordenadaX);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		CoordenadaX = 20;
		CoordenadaY = 65;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.yellow);
			ladrillo.setxCoord(CoordenadaX);
			ladrillo.setyCoord(CoordenadaY);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		CoordenadaX = 20;
		CoordenadaY = 100;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.red);
			ladrillo.setxCoord(CoordenadaX);
			ladrillo.setyCoord(CoordenadaY);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		CoordenadaX = 20;
		CoordenadaY = 135;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.orange);
			ladrillo.setxCoord(CoordenadaX);
			ladrillo.setyCoord(CoordenadaY);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		nave = new Nave();
		nave.setxCoord(230);
		nave.setyCoord(600);
		this.objetos.add(nave);
		// Mantengo una referencia al Player
		// Agrego un listener para eventos de teclado y, cuando se produzcan, los derivo al objeto de tipo Player
		this.addKeyListener(nave);
		
		
	}
		
	public void updateWorld() {
		pelota.mover();
		//llamo al metodo act de todos los objetos agregados a mi lista de actors
		for (Objeto o: this.objetos) {
			o.movimiento();
		}
	}
	
		
	
	public void game() {
		// Inicialización del juego
			initWorld();

		// El bucle se ejecutará mientras el objeto Canvas sea visible
		while (isVisible()) {
			long startTime = System.currentTimeMillis(); // Tomo el tiempo, en millis, antes de crear el siguiente Frame del juego
			// actualizo y pinto la escena
			updateWorld();
			paintWorld();
			// Calculo el tiempo que se ha tardado en la ejecución
			usedTime = System.currentTimeMillis() - startTime;
			// Hago que el bucle pare una serie de millis, antes de generar el siguiente FPS
			// El cálculo hecho "duerme" el proceso para no generar más de los SPEED_FPS que
			// se haya específicado
			try {
				int millisToSleep = (int) (1000 / SPEED_FPS - usedTime);
				if (millisToSleep < 0) {
					millisToSleep = 0;
				}
				Thread.sleep(millisToSleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//Realizamos nuestro patron singleton
	public static Arkanoid getInstace() {
		if(instance == null) {
			instance = new Arkanoid();
		}
		return instance;
	}
		
	public static void main(String[] args) {
		Arkanoid.getInstace().game();
	}
}