package instrucciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class insertar {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";
		

		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass)){

			String sql = "INSERT INTO CARS (ID, MARCA, MODELO, NUMKM) VALUES (?, ?, ?,?)"; 

			
			int id = 1;
			String marca = "Opel";
			String modelo = "Insignia";
			double numKm = 3000;
			
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			
			PreparedStatement sentencia;
			sentencia = con.prepareStatement(sql);

			sentencia.setInt(1, id);
			sentencia.setString(2, marca);
			sentencia.setString(3, modelo);
			sentencia.setDouble(4, numKm);
			

			int afectados = sentencia.executeUpdate();
			System.out.println("Sentencia SQL ejecutada con éxito");
			System.out.println("Registros afectados: "+afectados);
		} catch (SQLException e) {
			System.out.println("Error al añadir una nueva persona");
			System.out.println(e.getMessage());
		}

	}

}
