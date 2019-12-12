package tema4.examenPOO;

public class Pilaobjeto {
	
	private String nombre;
	private int id;
	private int suciedad;
	private int dureza;
	private static int totalTrabajo;
	private static boolean limpiezaTotal;
	private static int pasadasnecesarias;
	protected int seRompe;
	
	
	public Pilaobjeto(int id, String nombre) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.suciedad = (int) Math.round(Math.random() * (100 - 10) + 10);
		this.dureza = (int) Math.round(Math.random() * (3 - 1) + 1);;
		this.totalTrabajo = suciedad*dureza;
		this.limpiezaTotal = false;
		this.pasadasnecesarias = 0;
		this.seRompe = (int) Math.round(Math.random() * (1 - 0) + 1);
	}
	
	
	public static void limpiar () {
		totalTrabajo -= (int) Math.round(Math.random() * (40 - 20) + 20);
		if (totalTrabajo <= 0) {
			limpiezaTotal = true;
		}
		pasadasnecesarias++;
	}
	
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the seRompe
	 */
	public int getSeRompe() {
		return seRompe;
	}


	/**
	 * @param seRompe the seRompe to set
	 */
	public void setSeRompe(int seRompe) {
		this.seRompe = seRompe;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the suciedad
	 */
	public int getSuciedad() {
		return suciedad;
	}


	/**
	 * @param suciedad the suciedad to set
	 */
	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}


	/**
	 * @return the dureza
	 */
	public int getDureza() {
		return dureza;
	}


	/**
	 * @param dureza the dureza to set
	 */
	public void setDureza(int dureza) {
		this.dureza = dureza;
	}


	/**
	 * @return the totalTrabajo
	 */
	public int getTotalTrabajo() {
		return totalTrabajo;
	}


	/**
	 * @param totalTrabajo the totalTrabajo to set
	 */
	public void setTotalTrabajo(int totalTrabajo) {
		this.totalTrabajo = totalTrabajo;
	}


	/**
	 * @return the limpiezaTotal
	 */
	public boolean isLimpiezaTotal() {
		return limpiezaTotal;
	}


	/**
	 * @param limpiezaTotal the limpiezaTotal to set
	 */
	public void setLimpiezaTotal(boolean limpiezaTotal) {
		this.limpiezaTotal = limpiezaTotal;
	}


	/**
	 * @return the pasadasnecesarias
	 */
	public int getPasadasnecesarias() {
		return pasadasnecesarias;
	}


	/**
	 * @param pasadasnecesarias the pasadasnecesarias to set
	 */
	public void setPasadasnecesarias(int pasadasnecesarias) {
		this.pasadasnecesarias = pasadasnecesarias;
	}


	@Override
	public String toString() {
		return "Pilaobjeto [nombre=" + nombre + ", id=" + id + ", suciedad=" + suciedad + ", dureza=" + dureza
				+ ", totalTrabajo=" + totalTrabajo + ", limpiezaTotal=" + limpiezaTotal + ", pasadasnecesarias="
				+ pasadasnecesarias + ", seRompe=" + seRompe + "]";
	}



	


	

	
}
