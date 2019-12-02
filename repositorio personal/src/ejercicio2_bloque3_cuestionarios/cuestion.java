package ejercicio2_bloque3_cuestionarios;

public class cuestion {
	
	private String enunciado;
	private int respuestaCorrecta;
	
	public cuestion() {
		
	}
	
	public cuestion(String enunciado, int respuestaCorrecta) {
		this.enunciado = enunciado;
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	public int enunciado() {
		return enunciado;
	}
	/**
	 * @param anioFabricacion the anioFabricacion to set
	 */
	public void setrespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	

}
