package tema4.ejercicio_bloque03_ejercicio06;

public class Menu {
	private Plato primerPlato;
	private Plato segundoPlato;
	private Plato postre;

	/**
	 * @param primerPlato
	 * @param segundoPlato
	 * @param postre
	*/
	
	public Menu(Plato primerPlato, Plato segundoPlato, Plato postre) {
		super();
		this.primerPlato = primerPlato;
		this.segundoPlato = segundoPlato;
		this.postre = postre;
	}

	@Override
	public String toString() {
		return "Menu [primerPlato=" + primerPlato + ", segundoPlato=" + segundoPlato + ", postre=" + postre + "]";
	}
	
	public Plato getPrimerPlato() {
		return primerPlato;
	}
	
	public void setPrimerPlato(Plato primerPlato) {
		this.primerPlato = primerPlato;
	}
	
	public Plato getSegundoPlato(Plato segundoPlato) {
		return segundoPlato;
	}
	
	public void setSegundoPlato(Plato segundoPlato) {
		this.segundoPlato = segundoPlato;
	}
	
	public Plato getpostre() {
		return postre;
	}
	
	public void setpostre(Plato postre) {
		this.postre = postre;
	}
	
	

}