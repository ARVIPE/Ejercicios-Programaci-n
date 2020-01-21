package Juegos.Arkanoiderweno.Codigo;

import java.awt.Graphics;	
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;


public class Nave extends Objeto implements KeyListener, MouseMotionListener{
	// Propiedades específicas del jugador
	protected int vx; // Cantidad de píxeles que aumentará la posición del jugador en cada iteración del bucle principal del juego
	private boolean left,right; // Booleanas que determinan si el player se está moviendo actualmente
	protected static final int PLAYER_SPEED = 4; // velocidad del movimiento de la nave en los dos ejes
	private BufferedImage imagenDeNave;


	/**
	 * Constructor por defecto, que inicializa la imagen del jugador
	 */
	public Nave() {
		this.imagenDeNave = SpriteRepository.getInstance().getSprite("titosanti.png");
		ajustarAnchoAlto();
	}  
	
	public void ajustarAnchoAlto() {
		this.ancho = this.imagenDeNave.getWidth();
		this.alto = this.imagenDeNave.getHeight();
	}
	
	/**
	 * Método necesario para extender de Actor, incorpora el movimiento que el actor realizará en cada iteración del programa
	 */
	@Override 
	public void act() {
		//la nave solo se moverï¿½ sobre el eje x
		this.xCoord += this.vx;
		
		//limitacion del movimiento de la nave de manera que si llega a los bordes de la ventana no salga de la pantalla
		if (this.xCoord < 0 ) { this.xCoord = 0; }
		if (this.xCoord > (Arkanoid.getInstace().getWidth() - 60)) {
			this.xCoord = Arkanoid.getInstace().getWidth() - 60;
		}
	}
	/**
	@Override void colisionCon(Objeto naveColisionada) {
		super.collisionWith(naveColisionada);
		//Debo comprobar el tipo del actor que colisiona con este
		if(naveColisionada inst)
	}**/
		

	/**
	 * Cuando pulsen una tecla activamos la bandera booleana concreta que indica que existe un movimiento
	 */
	@Override
	public void keyPressed(KeyEvent e) {
	  	switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT : left = true; break;
			case KeyEvent.VK_RIGHT : right = true; break;
	  	}
	  	updateSpeed();
	}

	/**
	 * Cuando una tecla se libera se desactiva la bandera booleana que se había activado al pulsarla
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
  			case KeyEvent.VK_LEFT : left = false; break; 
  			case KeyEvent.VK_RIGHT : right = false;break;
		}
		updateSpeed();
	}
	  
	/**
	 * Este método no se utiliza pero es necesario implementarlo por el KeyListener
	 */
	@Override
	public void keyTyped(KeyEvent e) {}
	
	/**
	 * En función de las banderas booleanas de movimiento, actualizamos las velocidades en los dos ejes
	 */
	protected void updateSpeed() {
		vx=0;
		if (left) vx = -PLAYER_SPEED;
		if (right) vx = PLAYER_SPEED;
	}
		  
	
	// Métodos Getters y Setters
	public int getVx() { return vx; }
	public void setVx(int vx) { this.vx = vx; }


	@Override
	public void paint(Graphics g) {
		g.drawImage(imagenDeNave, this.xCoord, 600, null);

	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		setxCoord(arg0.getX());
		
	}

}


