package Juegos.Arkanoid;

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
		g.setColor(Color.RED);
		g.fillRect(this.xCoord, this.yCoord, this.ancho, this.alto);
	}

	

	
}


