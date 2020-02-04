package Juegos.Arkanoid.Codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Pelota extends Objeto implements KeyListener, MouseListener {

	protected int vx;
	protected int vy;
	private boolean space;
	protected static final int PLAYER_SPEED = 4;
	private int contador = 0;
	// Contador para cada una de las vidas de la pelota
	private int contadorVidas = 4;
	// Variable ficticia para medir el tiempo
	private long usedTime;
	// Variable con la que empieza a contar el tiempo en milis
	long startTime = System.currentTimeMillis();
	int contadortiempo = 0;
	// Creamos un boolean para decirle cuando iniciamos
	private boolean inicio = false;
	private TrayectoriaRecta t = null;
	private PuntoAltaPrecision p = null;
	private float distancia = 3;
	private BufferedImage imagenDeGameOver;
	// Creamos una lista para cada una de las vidas de la pelota
	public List<Pelota> vidapelotas = new ArrayList<Pelota>();

	public Pelota() {
		super();
		this.color = Color.gray;
		this.alto = 15;
		this.ancho = 15;
		this.vx = 0;
		this.vy = 0;

	}

	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(this.xCoord, this.yCoord, this.ancho, this.alto);
	}

	public void act() {
		//Para calcular nuestra variable fictia antes tomamos el startTime que es una unidad de tiempo fija que son las milesimas desde 1970 en ese preciso momento
		//Luego ejecutamos el systemcurrentmillis para que vaya sumando todo el rato milesimas desde 1970 luego la diferencia de la que va sumando todo el rato
		//menos la fija de antes tiene que llegarnos a 5000
		usedTime = System.currentTimeMillis() - startTime;
		if (usedTime >= 5000 && contadortiempo == 0 && contador == 0 && contadorVidas > 0 ) {
			//Este contador que utilizo para que la pelota no siga sumando velocidad
			//en el used time
			contadortiempo++;
			//Este es el contador para que no sume mas de una vez la velocidad
			//tanto en el space como en el raton
			contador++;
			//Llamamos al metodo para crear un punto
			primerPunto();
			//Cuando el inicio es true la pelota deja de estar donde esta la nave
			inicio = true;
		}
		//La pelota deja de estar donde la nave
		if (!inicio) {
			//Coordenadas en las que la pelota esta junto a la nave
			this.xCoord = Arkanoid.getInstace().getNave().getxCoord() + 17;
			this.yCoord = Arkanoid.getInstace().getNave().getyCoord() - 15;
		} else {
			// Le indicamos que si la pelota llega al borde izquierdo o derecho cambie de
			// sentido
			// Tenemos que tener en cuenta que el borde izquierdo es 0 pero el derecho es la
			// extension de la ventana
			// menos la de la pelota
			//Esta condicion siempre se va a cumplir independientemente de que el inicio se verdadero
			//o falso
			if (this.xCoord < 0 || this.xCoord > (Arkanoid.getInstace().getWidth() - this.ancho)) {
				t.reflejarHorizontalmenteRespectoAPunto(p);

			}
			// Le indicamos que si la pelota llega al borde superior o inferior cambie de
			// sentido
			if (this.yCoord < 0) {
				t.reflejarVerticalmenteRespectoAPunto(p);
			}
			// Aqui cogemos el anterior punto y de forma aleatoria generamos el siguiente
			// punto
			p = t.getPuntoADistanciaDePunto(p, distancia);
			this.xCoord = Math.round(p.x);
			this.yCoord = Math.round(p.y);
			
			if(yCoord >= (Arkanoid.getInstace().getHeight())){
				SoundRepository.getInstance().playSound(SoundRepository.MUSICAVIDA);
				inicio = false;
				//Vamos quitando vidas cada vez que llega al borde inferior
				contadorVidas--;
				//Como inicio es falso la pelota aparece donde la nave
				//pero como tenemos 4 vidas tenemos un limite de 4
				if(contadorVidas == 0) {
					this.setMarkedForRemoval(true);
					//Pintamos el gameover
					this.imagenDeGameOver = SpriteRepository.getInstance().getSprite("game-over.png");
					
				}
				//Restablecemos cada uno de los contadores de tiempo y de space y raton
				contadortiempo = 0;
				contador = 0;
				//Restablecemos el startTime
				startTime = System.currentTimeMillis();
			}
			
		}

	}

	public void paintImagenDeGameOver(Graphics g) {
		g.drawImage(imagenDeGameOver, (((Arkanoid.getInstace().getWidth()) / 2) - 180), 300, null);

	}

	public void primerPunto() {
		// Tomamos las coordenadas de la pelota para crear nuestro punto
		p = new PuntoAltaPrecision(this.xCoord, this.yCoord);
		// Indicamos la trayectoria por la que va la pelota
		t = new TrayectoriaRecta(1.7f, p, false);
	}

	@Override
	public void collisionWith(Objeto actorCollisioned) {
		super.collisionWith(actorCollisioned);
		if (actorCollisioned instanceof Ladrillo) {
			t.reflejarVerticalmenteRespectoAPunto(p);
			// Aumentar la velocidad
			distancia += 0.1;
			SoundRepository.getInstance().playSound(SoundRepository.EXPLOSION);
		}
		if (actorCollisioned instanceof Nave) {
			t.reflejarVerticalmenteRespectoAPunto(p);
			SoundRepository.getInstance().playSound(SoundRepository.CHOCARPELOTA);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (contador == 0 && contadorVidas > 0) {
			primerPunto();
			inicio = true;
		}
		contador++;
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			space = true;
			break;
		}
		updateSpeed();
		contador++;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
			space = false;
			break;
		}
		updateSpeed();
	}

	protected void updateSpeed() {
		if (contador == 0 && contadorVidas > 0) {
			if (space) {
				primerPunto();
				inicio = true;
			}
		}
	}

	public int getContadorVidas() {
		return contadorVidas;
	}

	public void setContadorVidas(int contadorVidas) {
		this.contadorVidas = contadorVidas;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
