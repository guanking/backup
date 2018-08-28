package db;

import java.sql.SQLException;

/**
 * 
 * @author GuanjieCao <br>
 * @description 共享：<br>
 *              1、数据库资料：<br>
 *              IP：10.121.51.12<br>
 *              帐号：administer<br>
 *              密码：1q2w3e4r<br>
 *              目录：dbjar,myshare,myshare2,Users<br>
 *              2、报文、问题：<br>
 *              IP:172.152.254.41<br>
 *              帐号：rd/c02804<br>
 *              密码：cgj@dp123<br>
 *              目录：uag,cdn<br>
 */
public abstract class DB {
	public static final String MySQLUrl = "jdbc:mysql://10.121.15.6:3306/cgj";
	public static final String MySQLUserName = "root";
	public static final String MySQLPassword = "1q2w3e4r";

	public static final String OracleUrl = "jdbc:oracle:thin:@10.121.15.55:1521:orcl";
	public static final String OracleUserName = "system";
	public static final String OraclePassword = "1q2w3e4r";

	public static final String SQLServerUrl = "jdbc:sqlserver://10.121.15.1:1433;DatabaseName=tempdb";
	public static final String SQLServerUserName = "sa";
	public static final String SQLServerPassword = "5584101";

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
