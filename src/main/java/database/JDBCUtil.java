package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;


public class JDBCUtil {
	public static Connection getcon() {
		Connection c =null;
		
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mySQL://localhost:3306/myweb?useUnicode=true&characterEncoding=UTF-8";
			String user = "root";
			String pass = "";
			
			c = DriverManager.getConnection(url,user,pass);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
		
	}
	
	public static void closecon(Connection c) {
		try {
		if (c!=null) {
		
				c.close();
		
		}	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
