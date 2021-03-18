import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		getConnection();
	}

	public static void getConnection() throws SQLException, ClassNotFoundException {

		String db = "java";
		String host = "localhost";
		String user = "root";
		String pass = "root";
		Connection connect = null;
		Statement statement = null;
		
		try {

		
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/"+db+"?user="+user+"&password="+pass);
			 //statement = connect.createStatement();

			System.out.println("Yes");
			
		} catch (Exception e) {
			System.out.println("No");
			System.out.println(connect);
		}
		

	}
}
