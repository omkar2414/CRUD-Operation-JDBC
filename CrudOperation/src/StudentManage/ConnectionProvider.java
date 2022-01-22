package StudentManage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Wrapper;

public class ConnectionProvider {
	static Connection con; 
	
	public static Connection createC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String user = "root";
			String password = "abc";
			String url = "jdbc:mysql://localhost:3306/CRUD";
			
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}


}
