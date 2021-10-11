package instrucciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class modificar {

	public static void main(String[] args) {

		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";

		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);) {

			String sql = "update cars set MARCA=?, MODELO=?, NUMKM=? WHERE ID=?";

			String marca = "Fiat";
			String modelo = "500";
			double numKm = 5857.78;
			int id = 1;

			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);

			PreparedStatement sentencia = con.prepareStatement(sql);

			sentencia.setString(1, marca);
			sentencia.setString(2, modelo);
			sentencia.setDouble(3, numKm);
			sentencia.setInt(4, id);

			int afectados = sentencia.executeUpdate();
			System.out.println("Sentencia SQL ejecutada con éxito");
			System.out.println("Registros afectados: " + afectados);
		} catch (SQLException e) {
			System.out.println("Error al añadir el nuevo coche");
			System.out.println(e.getMessage());
		}
	}
}
