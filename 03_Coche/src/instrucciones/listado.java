package instrucciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class listado {

	public static void main(String[] args) {

		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";


		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);) {
			PreparedStatement sentencia = con.prepareStatement("SELECT * FROM CARS");
			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("ID"));
				System.out.print(" - ");
				System.out.print(rs.getString("MARCA"));
				System.out.print(" - ");
				System.out.print(rs.getString("MODELO"));
				System.out.print(" - ");
				System.out.print(rs.getDouble("NUMKM"));
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}
	}
}
