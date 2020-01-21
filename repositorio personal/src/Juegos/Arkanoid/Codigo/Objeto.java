package Juegos.Arkanoid.Codigo;

import java.awt.Color;	
import java.awt.Graphics;
import java.awt.image.BufferedImage;	
import java.util.ArrayList;
import java.util.List;


public abstract class Objeto {
	
	public Color color;
	public int xCoord, yCoord;
	public int ancho, alto;
	protected BufferedImage spriteActual = null;
	protected boolean markedForRemoval = false; //Pondremos a true esta bandera cuando el objeto deba
											//ser eliminado de la siguiente iteracion del juego
	protected List<BufferedImage> sprites = new ArrayList<BufferedImage>();
	protected int velocidadDeCambioDeSprite = 0;
	protected int unidadDeTiempo = 0;
	
	
	
	
	public Objeto() {
		
	}
	
	
	/**
	 * Constructor usado cuando el actor s�lo tiene un �nico sprite
	 * @param spriteName
	 */
	public Objeto (String spriteName) {
		this.velocidadDeCambioDeSprite = 1;
		cargarImagenesDesdeSpriteNames(new String[] {spriteName});
	}
	
	/**
	 * Constructor ampl�amente utilizado, indicando los nombres de los sprites a utilizar para mostrar este actor
	 * @param spriteName
	 */
	public Objeto (String spriteNames[]) {
		this.velocidadDeCambioDeSprite = 1;
		cargarImagenesDesdeSpriteNames(spriteNames);
	}
	
	/**
	 * 
	 * @param spriteNames
	 * @param velocidadDeCambioDeSprite
	 */
	public Objeto (String spriteNames[], int velocidadDeCambioDeSprite) {
		this.velocidadDeCambioDeSprite = velocidadDeCambioDeSprite;
		cargarImagenesDesdeSpriteNames(spriteNames);
	}
	
	
	/**
	 * A partir de un array de String, cargamos en memoria la lista de im�genes que constituyen los sprites del actor
	 * @param spriteNames
	 */
	private void cargarImagenesDesdeSpriteNames (String spriteNames[]) {
		// Obtengo las im�genes de este actor, a partir del patr�n de dise�o Singleton con el que se encuentra
		// el spritesRepository
		for (String sprite : spriteNames) {
			this.sprites.add(SpriteRepository.getInstance().getSprite(sprite));
		}
		// ajusto el primer sprite del actor
		if (this.sprites.size() > 0) {
			this.spriteActual = this.sprites.get(0);
		}
		adjustHeightAndWidth ();
	}
	
	
	/**
	 * Actualiza los valores de width y height del Actor, a partir una BufferedImage que lo representar�
	 * en pantalla
	 */
	private void adjustHeightAndWidth () {
		// Una vez que tengo las im�genes que representa a este actor, obtengo el ancho y el alto m�ximos de las mismas y se
		// los traspaso a objeto actual.
		if (this.sprites.size() > 0) {
			this.alto = this.sprites.get(0).getHeight();
			this.ancho = this.sprites.get(0).getWidth();
		}
		for (BufferedImage sprite : this.sprites) {
			// Ajusto el m�ximo width como el width del actor
			if (sprite.getWidth() > this.ancho) {
				this.ancho = sprite.getWidth();
			}
			// Lo mismo que el anterior, pero con el m�ximo height
			if (sprite.getHeight() > this.alto) {
				this.alto = sprite.getHeight();
			}
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(this.spriteActual, this.xCoord, this.yCoord, null);
	}
	
	public void act() {
		// En el caso de que exista un array de sprites el actor actual se tratar� de una animaci�n, para eso llevaremos a cabo los siguientes pasos
		if (this.sprites != null && this.sprites.size() > 1) {
			// cada vez que llaman a "act()" se incrementar� esta unidad, siempre que existan sprites
			unidadDeTiempo++;
			// Si la unidad de tiemplo coincide o es m�ltiplo de la velocidad de cambio de sprite, entramos al if
			if (unidadDeTiempo % velocidadDeCambioDeSprite == 0){
				// Reiniciamos la unidad de tiempo
				unidadDeTiempo = 0;
				// Obtengo el �ndice del spriteActual, dentro de la lista de �ndices
				int indiceSpriteActual = sprites.indexOf(this.spriteActual);
				// Obtengo el siguiente �ndice de sprite, teniendo en cuenta que los sprites cambian de uno a otro en ciclo
				int indiceSiguienteSprite = (indiceSpriteActual + 1) % sprites.size();
				// Se selecciona el nuevo spriteActual
				this.spriteActual = sprites.get(indiceSiguienteSprite);
			}
		}
		
	}
	
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public BufferedImage getSpriteActual() { return spriteActual; }
	public void setSpriteActual(BufferedImage spriteActual) { this.spriteActual = spriteActual; }



	public void collisionWith(Objeto objetoColisionado) {}
	
	public boolean isMarkedForRemoval() { return markedForRemoval; }
	public void setMarkedForRemoval(boolean markedForRemoval) { this.markedForRemoval = markedForRemoval; }



	public void collisionCon(Objeto objetoCollisioned) {}


	
	
	
		
}
