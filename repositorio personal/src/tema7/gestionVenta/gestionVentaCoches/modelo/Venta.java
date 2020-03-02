package tema7.gestionVenta.gestionVentaCoches.modelo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Venta {

	int id;
	int idCliente;
	int idConcesionario;
	int idCoche;
	String fecha;
	float precioVenta;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	public Venta() {
	}

	public Venta(int id, int idCliente, int idConcesionario, int idCoche, String fecha, float precioVenta) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idConcesionario = idConcesionario;
		this.idCoche = idCoche;
		this.fecha = fecha;
		this.precioVenta = precioVenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public int getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(Date date) throws ParseException {
		this.fecha = sdf.format(date);
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", idCliente=" + idCliente + ", idConcesionario=" + idConcesionario + ", idCoche="
				+ idCoche + ", fecha=" + fecha + ", precioVenta=" + precioVenta + "]";
	}
  
	
	
	
	
}
