package madang.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##madang", "madang");
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}
		return conn;
	}
}
