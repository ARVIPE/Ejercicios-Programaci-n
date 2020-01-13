package Juegos.Arkanoid;

import java.awt.Color;
import java.awt.Graphics;



public class Pelota extends Objeto {

	protected int vx;
	protected int vy;
	
	public Pelota() {
		super();
		this.color = Color.white;
		this.xCoord = 260;
		this.yCoord = 160;
		this.alto = 15;
		this.ancho = 15;
		this.vx = 5;
		this.vy = 5;
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillOval(this.xCoord, this.yCoord, this.ancho, this.alto);
		
	}
	
	public void mover() {
		this.xCoord += this.vx;
		this.yCoord += this.vy;
		//this.y_coord += this.vy;
		
		if (this.xCoord < 0 || this.xCoord > (Arkanoid.getInstace().getWidth() - this.getAncho()) ) {
				
			vx = -vx;
			
		}
		if (this.yCoord < 0 || this.yCoord > (Arkanoid.getInstace().getHeight() - this.getAlto())) {
			vy = -vy;
		}
	}



	public int getVx() {
		return vx;
	}



	public void setVx(int vx) {
		this.vx = vx;
	}



	public int getVy() {
		return vy;
	}



	public void setVy(int vy) {
		this.vy = vy;
	}	
	
	


	
	
	
	
	
		
	


}
