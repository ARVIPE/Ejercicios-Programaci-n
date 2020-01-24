package Juegos.Arkanoid.Codigo;

import java.awt.Color;	
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Pelota extends Objeto implements KeyListener, MouseListener{

	protected int vx;
	protected int vy;
	private boolean space;
	protected static final int PLAYER_SPEED = 4;
	private int contador = 0;
	
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
		//Si la velocidad de la pelota es 0 aparece en las mismas coordenadas que la nave
		if(this.vx == 0 && this.vy == 0) {
			this.xCoord = Arkanoid.getInstace().getNave().getxCoord() + 17;
			this.yCoord = Arkanoid.getInstace().getNave().getyCoord() - 15;
		}
		
		//Vamos aumentando la velocidad horizontal y verticalmente
		this.xCoord += this.vx;
		this.yCoord += this.vy;
		
		//Le indicamos que si la pelota llega al borde izquierdo o derecho cambie de sentido
		//Tenemos que tener en cuenta que el borde izquierdo es 0 pero el derecho es la extension de la ventana
		//menos la de la pelota
		if(this.xCoord < 0 || this.xCoord > (Arkanoid.getInstace().getWidth() - 15)) {
			vx = -vx;
		
		}
		//Le indicamos que si la pelota llega al borde superior o inferior cambie de sentido
		if(this.yCoord < 0 || this.yCoord > (Arkanoid.getInstace().getHeight() - 60)) {
			vy = -vy;
		}
		
		
	}
	
	@Override
	public void collisionWith(Objeto actorCollisioned) {
		super.collisionWith(actorCollisioned);

		if (actorCollisioned instanceof Ladrillo){
			this.vy = -this.vy;
			SoundRepository.getInstance().playSound(SoundRepository.EXPLOSION);
		}
		if (actorCollisioned instanceof Nave) {
			this.vy = -this.vy;
			SoundRepository.getInstance().playSound(SoundRepository.CHOCARPELOTA);
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(contador == 0) {
			vx = 3;
			vy = 3;
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
			case KeyEvent.VK_SPACE : space = true; break;
	  	}
	  	updateSpeed();
	  	contador++;
	}


	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_SPACE : space = false; break; 
		}
		updateSpeed();
	}
	
	protected void updateSpeed() {
		if(contador == 0) {
			if (space) this.vx = 3;
			if (space) this.vy = 3;
		}
	}
	
	


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	



}
