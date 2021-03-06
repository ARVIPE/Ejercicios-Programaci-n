package ejerciciostabla.exportacionjava;

import java.io.Serializable;

/**
 * Model class of Cursan.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Cursan implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Alumnos. */
	private Alumnos alumnos;

	/** Asignaturas. */
	private Asignaturas asignaturas;

	/** Trimestre. */
	private String trimestre;

	/**
	 * Constructor.
	 */
	public Cursan() {
	}

	/**
	 * Set the Alumnos.
	 * 
	 * @param alumnos
	 *            Alumnos
	 */
	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	/**
	 * Get the Alumnos.
	 * 
	 * @return Alumnos
	 */
	public Alumnos getAlumnos() {
		return this.alumnos;
	}

	/**
	 * Set the Asignaturas.
	 * 
	 * @param asignaturas
	 *            Asignaturas
	 */
	public void setAsignaturas(Asignaturas asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Get the Asignaturas.
	 * 
	 * @return Asignaturas
	 */
	public Asignaturas getAsignaturas() {
		return this.asignaturas;
	}

	/**
	 * Set the Trimestre.
	 * 
	 * @param trimestre
	 *            Trimestre
	 */
	public void setTrimestre(String trimestre) {
		this.trimestre = trimestre;
	}

	/**
	 * Get the Trimestre.
	 * 
	 * @return Trimestre
	 */
	public String getTrimestre() {
		return this.trimestre;
	}


}
