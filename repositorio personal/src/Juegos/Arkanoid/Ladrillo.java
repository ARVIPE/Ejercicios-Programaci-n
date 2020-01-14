/**package Juegos.Arkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Objeto{

	public Ladrillo(String nombre, String color) {
		super(nombre, color);
		
	}
	
	public static Ladrillo instance = null;
	
	public static Ladrillo getInstance() {
		if(instance == null) {
			instance = new Ladrillo(null, null);
		}
		return instance;
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(50, 50, 30, 30);
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}


**/