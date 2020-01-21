package Juegos.Arkanoiderweno.Codigo;

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
	public void collisionWith(Objeto objetoCollisioned) { 
		super.collisionWith(objetoCollisioned);
		//Debo comprobar el tipo del objeto que colisiona con este
		if(objetoCollisioned instanceof Pelota) {
			//Si este actor colisiona con una pelota, debo eliminar ladrillo
			this.setMarkedForRemoval(true);
			this.createExplosion();	
		}	
	}


	private void createExplosion() {
		Explosion explosion = new Explosion();
		explosion.setxCoord(this.xCoord + (this.ancho / 2) - explosion.getAncho() / 2);
		explosion.setyCoord(this.yCoord + (this.alto / 2) - explosion.getAlto() / 2);
        Arkanoid.getInstace().addNewActorToNextIteration(explosion);
	}


	

	
}


