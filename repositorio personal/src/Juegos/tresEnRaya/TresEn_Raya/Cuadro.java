package Juegos.tresEnRaya.TresEn_Raya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Cuadro {
	
	private int xEnTablero, yEnTablero;
	
	private int esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY;
	// Ancho y alto de este cuadro
	private int ancho, alto;
	
	private int jugadorPropietario = 0;


	public Cuadro(int xEnTablero, int yEnTablero) {
		super();
		this.xEnTablero = xEnTablero;
		this.yEnTablero = yEnTablero;
	}


	public void paint (Graphics g) {
		// Obtengo el ancho y el alto de cada cuadro, obteniendo el alto y el ancho
		// del Canvas principal del juego y diviendo estos valores entre tres
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		esquinaSuperiorIzquierdaX = this.xEnTablero * ancho;
		esquinaSuperiorIzquierdaY = this.yEnTablero * alto;
		
	
		g.setColor(Color.BLACK);
		g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto);
		

		pintaImagenesMapasDeBits(g);
	}
	
	/**
	 * Dependiendo del jugador propietario de este cuadro, se pintará una cruz o un círculo
	 * @param g
	 */
	private void pintaImagenesVectoriales (Graphics g) {
		
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_1) { 
			
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, 
					this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY + alto);
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY + alto, 
					this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY);
		} 
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_2) { 
			g.drawOval(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.ancho, this.alto);
		}
	}
	

	private void pintaImagenesMapasDeBits (Graphics g) {
		
		BufferedImage imagenAPintar = null;
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_1) { // Comprueba jugador 1 - Pinto el escudo del Real Madrid CF
			imagenAPintar = SpritesRepository.getInstance().getSprite(SpritesRepository.IMAGEN_JUGADOR_1);
		} 
		if (this.jugadorPropietario == TresEnRaya.JUGADOR_2) { // En este caso el jugador 2 - Pinto el escudo del FCB 
			imagenAPintar = SpritesRepository.getInstance().getSprite(SpritesRepository.IMAGEN_JUGADOR_2);
		}
		
	
		if (imagenAPintar != null) {
			int x = this.esquinaSuperiorIzquierdaX + this.ancho / 2 - imagenAPintar.getWidth() / 2;
			int y = this.esquinaSuperiorIzquierdaY + this.alto / 2 - imagenAPintar.getHeight() / 2;
			g.drawImage(imagenAPintar, x, y, null);
		}
	}

	
	public boolean seHaHechoclicSobreCuadro (int xClic, int yClic) {

		if (xClic > this.esquinaSuperiorIzquierdaX && xClic < (esquinaSuperiorIzquierdaX + ancho) 
				&&
			yClic > this.esquinaSuperiorIzquierdaY && yClic < (esquinaSuperiorIzquierdaY + alto)) {
			return true;
		}
		return false;
	}
	

	public void clic (int jugador) {
		if (this.jugadorPropietario == 0) {
			this.jugadorPropietario = jugador;
		}
		

		TresEnRaya.getInstance().getMatrizJugadas()[this.yEnTablero][this.xEnTablero] = jugador;
		

		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();
		
	
		System.out.println("Estado del juego");
		for (int i = 0; i < TresEnRaya.getInstance().getMatrizJugadas().length; i++) {
			for (int j = 0; j < TresEnRaya.getInstance().getMatrizJugadas()[i].length; j++) {
				System.out.print(TresEnRaya.getInstance().getMatrizJugadas()[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Cuadro [xEnTablero=" + xEnTablero + ", yEnTablero=" + yEnTablero + ", jugadorPropietario="
				+ jugadorPropietario + "]";
	}

	// Setters y getters	
	public int getxEnTablero() {
		return xEnTablero;
	}

	public void setxEnTablero(int xEnTablero) {
		this.xEnTablero = xEnTablero;
	}

	public int getyEnTablero() {
		return yEnTablero;
	}

	public void setyEnTablero(int yEnTablero) {
		this.yEnTablero = yEnTablero;
	}

	
}
