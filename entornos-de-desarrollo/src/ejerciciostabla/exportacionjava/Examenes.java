package ejerciciostabla.exportacionjava;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of Examenes.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Examenes implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** Num_exam. */
	private Long numExam;

	/** Preguntas. */
	private Long preguntas;

	/** Fecha. */
	private Date fecha;

	/** The set of Hacen. */
	private Set<Hacen> hacenSet;

	/**
	 * Constructor.
	 */
	public Examenes() {
		this.hacenSet = new HashSet<Hacen>();
	}

	/**
	 * Set the Num_exam.
	 * 
	 * @param numExam
	 *            Num_exam
	 */
	public void setNumExam(Long numExam) {
		this.numExam = numExam;
	}

	/**
	 * Get the Num_exam.
	 * 
	 * @return Num_exam
	 */
	public Long getNumExam() {
		return this.numExam;
	}

	/**
	 * Set the Preguntas.
	 * 
	 * @param preguntas
	 *            Preguntas
	 */
	public void setPreguntas(Long preguntas) {
		this.preguntas = preguntas;
	}

	/**
	 * Get the Preguntas.
	 * 
	 * @return Preguntas
	 */
	public Long getPreguntas() {
		return this.preguntas;
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
	 * Set the set of the Hacen.
	 * 
	 * @param hacenSet
	 *            The set of Hacen
	 */
	public void setHacenSet(Set<Hacen> hacenSet) {
		this.hacenSet = hacenSet;
	}

	/**
	 * Add the Hacen.
	 * 
	 * @param hacen
	 *            Hacen
	 */
	public void addHacen(Hacen hacen) {
		this.hacenSet.add(hacen);
	}

	/**
	 * Get the set of the Hacen.
	 * 
	 * @return The set of Hacen
	 */
	public Set<Hacen> getHacenSet() {
		return this.hacenSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numExam == null) ? 0 : numExam.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Examenes other = (Examenes) obj;
		if (numExam == null) {
			if (other.numExam != null) {
				return false;
			}
		} else if (!numExam.equals(other.numExam)) {
			return false;
		}
		return true;
	}

}
