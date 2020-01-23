package Juegos.Arkanoid.Codigo;

import java.awt.Canvas;				
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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

public class Arkanoid extends Canvas  {
	// Indicamos alto y ancho del objeto tipo Canvas
	public static final int WIDTH = 520;
	public static final int HEIGHT = 700;
	private static Arkanoid instance = null;
	// Lista con todos los actores que intervienen en el videojuego
	public List <Objeto> objetos = new ArrayList<Objeto>();
	// Lista con actores que deben incorporarse en la siguiente iteracion del juego
	private List<Objeto> newActorsForNextInteration = new ArrayList<Objeto>();
	Pelota pelota = null;
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
			ladrillo.setColor(Color.red);
			ladrillo.setxCoord(CoordenadaX);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		CoordenadaX = 20;
		CoordenadaY = 65;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.blue);
			ladrillo.setxCoord(CoordenadaX);
			ladrillo.setyCoord(CoordenadaY);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		CoordenadaX = 20;
		CoordenadaY = 100;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.yellow);
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
		CoordenadaX = 20;
		CoordenadaY = 170;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.pink);
			ladrillo.setxCoord(CoordenadaX);
			ladrillo.setyCoord(CoordenadaY);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		CoordenadaX = 20;
		CoordenadaY = 205;
		for(int i = 0; i <= 9; i++) {
			Ladrillo ladrillo = new Ladrillo();
			ladrillo.setColor(Color.green);
			ladrillo.setxCoord(CoordenadaX);
			ladrillo.setyCoord(CoordenadaY);
			objetos.add(ladrillo);
			CoordenadaX += ladrillo.getAncho() + 2;
		}
		
		nave = new Nave();
		nave.setxCoord(230);
		nave.setyCoord(600);
		this.objetos.add(nave);
		
		pelota = new Pelota();
		pelota.setxCoord(400);
		pelota.setyCoord(300);
		this.objetos.add(pelota);

		// Mantengo una referencia al Player
		// Agrego un listener para eventos de teclado y, cuando se produzcan, los derivo al objeto de tipo Player
		this.addKeyListener(nave);
		this.addMouseMotionListener(nave);
		this.addKeyListener(pelota);
		this.addMouseListener(pelota);
		
		
	}
		
	public void updateWorld() {
		//llamo al metodo act de todos los objetos agregados a mi lista de actors
		for (Objeto o: this.objetos) {
			o.act();
		}
		List<Objeto> actorsForRemoval = new ArrayList<Objeto>();
		for (Objeto actor : this.objetos) {
			if (actor.isMarkedForRemoval()) {
				actorsForRemoval.add(actor);
			}
		}
		// Elimino los actores marcados para su eliminación
		for (Objeto actor : actorsForRemoval) {
			this.objetos.remove(actor);
		}
		// Limpio la lista de actores para eliminar
		actorsForRemoval.clear();
		
		// Además de eliminar actores, también puede haber actores nuevos que se deban insertar en la siguiente iteración.
		// Se insertan y después se limpia la lista de nuevos actores a insertar
		this.objetos.addAll(newActorsForNextInteration);
		this.newActorsForNextInteration.clear();

		// Finalmente, se llama al método "act" de cada actor, para que cada uno recalcule por si mismo sus valores.
		for (Objeto actor : this.objetos) {
			actor.act();
		}
		boolean yaHaColisionado = false;
		// Una vez que cada actor ha actuado, intento detectar colisiones entre los actores y notificarlas. Para detectar
		// estas colisiones, no nos queda más remedio que intentar detectar la colisión de cualquier actor con cualquier otro
		// sólo con la excepción de no comparar un actor consigo mismo.
		// La detección de colisiones se va a baser en formar un rectángulo con las medidas que ocupa cada actor en pantalla,
		// De esa manera, las colisiones se traducirán en intersecciones entre rectángulos.
		for (Objeto actor1 : this.objetos) {
			// Creo un rectángulo para este actor.
			Rectangle rect1 = new Rectangle(actor1.getxCoord(), actor1.getyCoord(), actor1.getAncho(), actor1.getAlto());
			// Compruebo un actor con cualquier otro actor
			for (Objeto actor2 : this.objetos) {
				// Evito comparar un actor consigo mismo, ya que eso siempre provocaría una colisión y no tiene sentido
				if (!actor1.equals(actor2)) {
					// Formo el rectángulo del actor 2
					Rectangle rect2 = new Rectangle(actor2.getxCoord(), actor2.getyCoord(), actor2.getAncho(), actor2.getAlto());
					// Si los dos rectángulos tienen alguna intersección, notifico una colisión en los dos actores
					if (rect1.intersects(rect2)) {
						actor1.collisionWith(actor2); // El actor 1 colisiona con el actor 2
						actor2.collisionWith(actor1); // El actor 2 colisiona con el actor 1
						yaHaColisionado = true;
						break;
					}
				}
			}
			if (yaHaColisionado == true) break;
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
	
	public void addNewActorToNextIteration (Objeto newObjeto) {
		this.newActorsForNextInteration.add(newObjeto);
	}

	//Realizamos nuestro patron singleton
	public static Arkanoid getInstace() {
		if(instance == null) {
			instance = new Arkanoid();
		}
		return instance;
	}
	
		
	public Nave getNave() {
		return nave;
	}

	public static void main(String[] args) {
		Arkanoid.getInstace().game();
	}
}