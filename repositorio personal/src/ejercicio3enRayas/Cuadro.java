package ejercicio3enRayas;

import java.awt.Color;
import java.awt.Graphics;

public class Cuadro {

	private int XenTablero, YenTablero;
	
	private int esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY;
	
	private int ancho, alto;

	public Cuadro(int xenTablero, int yenTablero) {
		super();
		XenTablero = xenTablero;
		YenTablero = yenTablero;
	}

	/**
	 * @return the xenTablero
	 */
	public int getXenTablero() {
		return XenTablero;
	}

	/**
	 * @param xenTablero the xenTablero to set
	 */
	public void setXenTablero(int xenTablero) {
		XenTablero = xenTablero;
	}

	/**
	 * @return the yenTablero
	 */
	public int getYenTablero() {
		return YenTablero;
	}

	/**
	 * @param yenTablero the yenTablero to set
	 */
	public void setYenTablero(int yenTablero) {
		YenTablero = yenTablero;
	}

	@Override
	public String toString() {
		return "Cuadros [XenTablero=" + XenTablero + ", YenTablero=" + YenTablero + "]";
	}

	public void paint(Graphics g) {
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		esquinaSuperiorIzquierdaX = this.XenTablero * ancho;
		esquinaSuperiorIzquierdaY = this.YenTablero * alto;
		
		g.setColor(Color.BLACK);
		g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto);
		
		
	}
	
	public boolean seHaHechoclicSobreElCuadro (int xClic, int yClic) {
		if(xClic > this.esquinaSuperiorIzquierdaX && xClic < (esquinaSuperiorIzquierdaX + ancho) 
				&&
				yClic > this.esquinaSuperiorIzquierdaY && yClic < (esquinaSuperiorIzquierdaY + alto)) { 
				return true;
		}else {
		return false;
		}
	}

	public void clic() {	
		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();

	}
}


