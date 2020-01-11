package Juegos.Arkanoid;

import java.awt.Graphics;

public class Pelota extends Objeto {

	public Pelota(String nombre, String color, int xCoord, int yCoord) {
		super(nombre, color, xCoord, yCoord);
		
	}
	
	public void pintarPelota(Graphics g){
		g.drawOval(0, 0, 500, 500);
	}
	
	
	
	
	
		
	


}
