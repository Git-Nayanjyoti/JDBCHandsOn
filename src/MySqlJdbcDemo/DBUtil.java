package MySqlJdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String oraUser = "root";
	private static final String oraPass = "hr";
	private static final String oraUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String mysqlUser = "root";
	private static final String mysqlPass = "Sam-witz38";
	private static final String mysqlUrl = "jdbc:mysql://localhost:3306";

	public static Connection getConnection(DBType dbType) throws SQLException {
		switch (dbType) {
		case MYSQLDB:
			return DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPass);
		case ORADB:
			return DriverManager.getConnection(oraUrl, oraUser, oraPass);
		default:
			return null;
		}

	}
}
