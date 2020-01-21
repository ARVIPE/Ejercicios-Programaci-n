package Juegos.Arkanoiderweno.Codigo;

import java.awt.Color;	
import java.awt.Graphics;

public class Pelota extends Objeto {

	protected int vx;
	protected int vy;
	
	public Pelota() {
		super();
		this.color = Color.gray;
		this.xCoord = 240;
		this.yCoord = 140;
		this.alto = 15;
		this.ancho = 15;
		this.vx = 3;
		this.vy = 3;

	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(this.xCoord, this.yCoord, this.ancho, this.alto);
		
	}
	
	public void act() {
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

		if (actorCollisioned instanceof Ladrillo || actorCollisioned instanceof Nave) {
			this.vy = -this.vy;
		}


	}




}
