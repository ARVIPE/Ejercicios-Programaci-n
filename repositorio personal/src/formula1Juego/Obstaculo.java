package formula1Juego;

public abstract class Obstaculo {
	
	private int posicionObstaculo;
	protected int impulso;
	private int retroceso;


	public Obstaculo() {
		super();
		this.posicionObstaculo = (int) Math.round(Math.random() * (100 - 1) + 1);
		this.impulso = (int) Math.round(Math.random() * (20 - 10) + 10);
	}

	
	
	public void restarOsumaObstaculo() {
		
		
	}
	/**
	 * @return the posicionObstaculo
	 */
	public int getPosicionObstaculo() {
		return posicionObstaculo;
	}

	/**
	 * @param posicionObstaculo the posicionObstaculo to set
	 */
	public void setPosicionObstaculo(int posicionObstaculo) {
		this.posicionObstaculo = posicionObstaculo;
	}

	/**
	 * @return the impulso
	 */
	public int getImpulso() {
		return impulso;
	}

	/**
	 * @param impulso the impulso to set
	 */
	public void setImpulso(int impulso) {
		this.impulso = impulso;
	}

	/**
	 * @return the retroceso
	 */
	public int getRetroceso() {
		return retroceso;
	}

	/**
	 * @param retroceso the retroceso to set
	 */
	public void setRetroceso(int retroceso) {
		this.retroceso = retroceso;
	}
	

	@Override
	public String toString() {
		return "Obstaculo [posicionObstaculo=" + posicionObstaculo + ", impulso=" + impulso + ", retroceso=" + retroceso
				+ "]";
	}

	public abstract void impulso();

	

	
}
