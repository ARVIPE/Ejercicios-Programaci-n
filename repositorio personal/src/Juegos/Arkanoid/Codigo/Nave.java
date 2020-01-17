package Juegos.Arkanoid.Codigo;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Nave extends Objeto implements KeyListener{
	// Propiedades específicas del jugador
	protected int vx; // Cantidad de píxeles que aumentará la posición del jugador en cada iteración del bucle principal del juego
	private boolean left,right; // Booleanas que determinan si el player se está moviendo actualmente
	protected static final int PLAYER_SPEED = 4; // velocidad del movimiento de la nave en los dos ejes
	private BufferedImage ImagenDeNave;


	/**
	 * Constructor por defecto, que inicializa la imagen del jugador
	 */
	public Nave() {
		super("nave-50x15.png");
		
	}
	public void paintNave(Graphics g) {
		drawImage(g);
	}
	
	private void drawImage(Graphics g) {
		g.drawImage(this.ImagenDeNave, this.xCoord, this.yCoord, null);
		
	}
	/**
	 * Método necesario para extender de Actor, incorpora el movimiento que el actor realizará en cada iteración del programa
	 */
	public void movimiento() {
		if(xCoord < 0) {
			xCoord = 0;
		}
		if(xCoord == (Arkanoid.getInstace().getWidth() - 15)) {
			xCoord = Arkanoid.getInstace().getWidth() - 15;
		}
	}
		

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
		// TODO Auto-generated method stub
		
	}

}


