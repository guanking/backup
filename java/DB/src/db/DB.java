package db;

import java.sql.SQLException;

public abstract class DB {
	public static final String MySQLUrl = "";
	public static final String MySQLUserName = "";
	public static final String MySQLPassword = "";

	public static final String OracleUrl = "";
	public static final String OracleUserName = "";
	public static final String OraclePassword = "";

	public static final String SQLServerUrl = "";
	public static final String SQLServerUserName = "";
	public static final String SQLServerPassword = "";

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public abstract boolean login(boolean successLogin);

	public abstract boolean select(String table) throws SQLException;

	public abstract boolean create() throws SQLException;

	public abstract boolean insert(String table, String cols[], String vals[]) throws SQLException;

	public abstract boolean update(String table, String colName, String newVal) throws SQLException;

	public abstract boolean delete(String table) throws SQLException;

	public abstract boolean drop() throws SQLException;
}
