package MySqlJdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySqlConnection {
//	static String username = "root";
//	static String password = "Sam-witz38";
//	static String dbUrl = "jdbc:mysql://localhost:3306";
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		try {
			//conn = DriverManager.getConnection(dbUrl, username, password);
			conn = DBUtil.getConnection(DBType.MYSQLDB);
			System.out.println("Connection Established to MYSQL Database");
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		finally {
			conn.close();
		}
	}
}
