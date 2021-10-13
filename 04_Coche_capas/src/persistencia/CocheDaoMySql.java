package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidad.coche;
import persistencia.interfaces.DaoCoche;

public class CocheDaoMySql implements DaoCoche{

	private Connection conexion;

	public boolean abrirConexion() {
		String url = "jdbc:mysql://localhost:3306/almacen";
		String usuario = "root";
		String password = "";
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean cerrarConexion() {
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean alta(coche c) {
		if (!abrirConexion()) {
			return false;
		}
		boolean alta = true;

		String query = "insert into coches (MATRICULA,MARCA,MODELO,NUMKM) " + " values(?,?,?,?)";
		try {
			// preparamos la query con valores parametrizables(?)
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, c.getMatricula());
			ps.setString(2, c.getMarca());
			ps.setString(3, c.getModelo());
			ps.setDouble(4, c.getKm());

			int numeroFilasAfectadas = ps.executeUpdate();
			if (numeroFilasAfectadas == 0) {
				alta = false;
			}
		} catch (SQLException e) {
			System.out.println("alta -> Error al insertar: " + c);
			alta = false;
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return alta;
	}

	@Override
	public boolean baja(String id) {
		if (!abrirConexion()) {
			return false;
		}

		boolean borrado = true;
		String query = "delete from coches where MATRICULA = ?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			// sustituimos la primera interrgante por la id
			ps.setString(1, id);

			int numeroFilasAfectadas = ps.executeUpdate();
			if (numeroFilasAfectadas == 0)
				borrado = false;
		} catch (SQLException e) {
			System.out.println("baja -> No se ha podido dar de baja" + " la matricula " + id);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		return borrado;
	}

	@Override
	public boolean modificar(coche c) {
		if (!abrirConexion()) {
			return false;
		}
		boolean modificado = true;
		String query = "update personas set MARCA=?, MODELO=?, " + "NUMKM=? WHERE MATRICULA=?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, c.getMarca());
			ps.setString(2, c.getModelo());
			ps.setDouble(3, c.getKm());
			ps.setString(4, c.getMatricula());

			int numeroFilasAfectadas = ps.executeUpdate();
			if (numeroFilasAfectadas == 0)
				modificado = false;
			else
				modificado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("modificar -> error al modificar el " + " coche " + c);
			modificado = false;
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return modificado;
	}

	@Override
	public coche obtener(String id) {
		if (!abrirConexion()) {
			return null;
		}
		coche coche = null;

		String query = "select MATRICULA,MARCA,MODELO,NUMKM from coches " + "where MATRICULA = ?";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				coche = new coche();
				coche.setMatricula(rs.getString(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setKm(rs.getDouble(4));
			}
		} catch (SQLException e) {
			System.out.println("obtener -> error al obtener el " + "coche con matricula " + id);
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return coche;
	}

	@Override
	public List<coche> listar() {
		if (!abrirConexion()) {
			return null;
		}
		List<coche> listaPersonas = new ArrayList<>();

		String query = "select MATRICULA,MARCA,MODELO,NUMKM from coches";
		try {
			PreparedStatement ps = conexion.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				coche coche = new coche();
				coche.setMatricula(rs.getString(1));
				coche.setMarca(rs.getString(2));
				coche.setModelo(rs.getString(3));
				coche.setKm(rs.getDouble(4));

				listaPersonas.add(coche);
			}
		} catch (SQLException e) {
			System.out.println("listar -> error al obtener los " + "coches");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}

		return listaPersonas;
	}
}
