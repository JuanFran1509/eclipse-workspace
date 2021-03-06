package instrucciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class borrar {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/coches";
		String user = "root";
		String pass = "";
				
		try (Connection con = DriverManager.getConnection(cadenaConexion, user, pass);){
			
			String sql = "DELETE FROM CARS WHERE ID=?"; 
			
			int id = 1;
			
			System.out.println("Se va a ejecutar la siguiente sentencia SQL:");
			System.out.println(sql);
			
			PreparedStatement sentencia = con.prepareStatement(sql);
			sentencia.setInt(1, id);
			
			int afectados = sentencia.executeUpdate();
			System.out.println("Sentencia SQL ejecutada con ?xito");
			System.out.println("Registros afectados: "+afectados);
		} catch (SQLException e) {
			System.out.println("Error al borrar el coche");
			System.out.println(e.getMessage());
		}
	}
}
