package tema7.gestionVenta.gestionVentaCoches.modelo.controladores;

import java.sql.Connection;			
import java.sql.PreparedStatement;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema7.gestionVenta.gestionVentaCoches.modelo.Cliente;


public class ControladorCliente extends ControladorBBDD {

	
	
	public static List<Cliente> getAll () throws ErrorBBDDException {
		List<Cliente> fabricantes = new ArrayList<Cliente> ();
				
		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from cliente");

			while (rs.next()) {
				Cliente clien = new Cliente();
				clien.setId(rs.getInt("id"));
				clien.setNombre(rs.getString("nombre"));
				clien.setApellidos(rs.getString("apellidos"));
				clien.setLocalidad(rs.getString("localidad"));
				clien.setDniNie(rs.getString("dniNie"));
				clien.setFechaNac(rs.getDate("fechaNac"));
				fabricantes.add(clien);
			}
			
			s.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		} 
		return fabricantes;
	}
	
	
	
	
	/**
	 * 
	 * @param actors
	 * @throws ErrorBBDDException
	 */
	public static void almacenar (Cliente cliente) throws ErrorBBDDException {
		if (get(cliente.getId()) != null) { // Solo modificar
			almacenarModificado(cliente);
		}
		else { // Crear nuevo objeto en la BBDD
			almacenarNuevo(cliente);
		}
	}
	

	
	/**
	 * 
	 * @param fabricante
	 * @return
	 * @throws ErrorBBDDException
	 */
	public static Cliente get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Cliente clien = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from cliente where id = " + id);

			if (rs.next()) {
				clien = new Cliente();
				clien.setId(id);
				clien.setNombre(rs.getString("nombre"));
				clien.setApellidos(rs.getString("apellidos"));
				clien.setLocalidad(rs.getString("localidad"));
				clien.setDniNie(rs.getString("dniNie"));
				clien.setFechaNac(rs.getDate("fechaNac"));
			}
			s.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		} 
		return clien;
	}
	
	
	
	
	/**
	 * 
	 * @param actors
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo (Cliente clien) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
					"INSERT INTO cliente (id, nombre, apellidos, localidad, dniNie, fechaNac, activo) VALUES  (?, ?, ?, ?, ?, ?, ?)");
			int registrosInsertados;
			
			ps.setInt(1, nextIdEnTabla(conn, "cliente")); 
			ps.setString(2, clien.getNombre());
			ps.setString(3, clien.getApellidos());
			ps.setString(4, clien.getLocalidad());
			ps.setString(5, clien.getDniNie());
			ps.setString(6, clien.getFechaNac());
			ps.setBoolean(7, true);

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la inserción del nuevo registro");
			}
			ps.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}
	
	
	/**
	 * 
	 * @param actors
	 * @throws ErrorBBDDException
	 */
	public static void almacenarModificado (Cliente clien) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
					"update cliente set nombre = ?, apellidos = ?, localidad = ?, dniNie = ?, fechaNac = ?, activo = ? where id = ?");
			int registrosInsertados;
			
			ps.setString(1, clien.getNombre());
			ps.setString(2, clien.getApellidos());
			ps.setString(3,	clien.getLocalidad());
			ps.setString(4, clien.getDniNie());
			ps.setString(5, clien.getFechaNac());
			ps.setBoolean(6, clien.isActivo());
			ps.setInt(7, clien.getId());

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la modificación del registro");
			}
			ps.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}
	
	
	
	/**
	 * 
	 * @param actors
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Cliente clien) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
					"delete from cliente where id = ?");
			int registrosInsertados;
			
			ps.setInt(1, clien.getId()); 

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la eliminación del registro");
			}
			ps.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}
	
	
}
