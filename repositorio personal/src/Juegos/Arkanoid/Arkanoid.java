package Juegos.Arkanoid;

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
	public static final int WIDTH = 500;
	public static final int HEIGHT = 700;
	private static Arkanoid instance = null;
	public List <Ladrillo> muro = new ArrayList<Ladrillo>();
	Pelota pelota = new Pelota();

	
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
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
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
		pelota.paint(g);
		strategy.show();

	
	}
	
	private void initWorld() {
		for(int i = 0; i <= 12; i++) {
			Ladrillo ladrillo = new Ladrillo();
			g.setColor(Color.yellow);
			g.fillRect(100, 100, 45, 30);
			muro.add(ladrillo);
		}
		
	}
		
	public void updateWorld() {
		pelota.mover();
	}
	
	public void game() {
		// Inicialización del juego
			initWorld();
		
		// El bucle se ejecutará mientras el objeto Canvas sea visible
		while (isVisible()) {
			// actualizo y pinto la escena
			updateWorld();
			paintWorld();
			
			try {
				Thread.sleep(SPEED_FPS);
			}catch (InterruptedException e) {}
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