package Juegos.Arkanoid.Codigo;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Objeto{

	public Ladrillo() {
		super();
		this.color = Color.yellow;
		this.xCoord = 20;
		this.yCoord = 30;
		this.alto = 30;
		this.ancho = 45;
	}
	

	public void paint(Graphics g) {
		g.setColor(getColor());
		g.fillRect(this.getxCoord(), this.getyCoord(), this.ancho, this.alto);
	}


	@Override
	protected void movimiento() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void collisionWith(Objeto objetoCollisioned) { 
		super.collisionWith(objetoCollisioned);
		//Debo comprobar el tipo del objeto que colisiona con este
		if(objetoCollisioned instanceof Pelota) {
			//Si este actor colisiona con una pelota, debo eliminar ladrillo
			this.setMarkedForRemoval(true);
			
		}
		
		
	}


	

	
}


