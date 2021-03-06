package ejerciciostabla.exportacionjava;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of Realizan.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Realizan implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Alumnos. */
	private Alumnos alumnos;

	/** Practicas. */
	private Practicas practicas;

	/** Fecha. */
	private Date fecha;

	/** Nota. */
	private Long nota;

	/**
	 * Constructor.
	 */
	public Realizan() {
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
	 * Set the Practicas.
	 * 
	 * @param practicas
	 *            Practicas
	 */
	public void setPracticas(Practicas practicas) {
		this.practicas = practicas;
	}

	/**
	 * Get the Practicas.
	 * 
	 * @return Practicas
	 */
	public Practicas getPracticas() {
		return this.practicas;
	}

	/**
	 * Set the Fecha.
	 * 
	 * @param fecha
	 *            Fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Get the Fecha.
	 * 
	 * @return Fecha
	 */
	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * Set the Nota.
	 * 
	 * @param nota
	 *            Nota
	 */
	public void setNota(Long nota) {
		this.nota = nota;
	}

	/**
	 * Get the Nota.
	 * 
	 * @return Nota
	 */
	public Long getNota() {
		return this.nota;
	}


}
