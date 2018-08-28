package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql extends DB {

	public boolean login(boolean successLogin) {
		Connection conn = null;
		try {
			if (successLogin) {
				conn = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			} else {
				conn = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, "fdsafdyyr145");
			}
			conn.close();
		} catch (SQLException se) {
			return false;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return true;
	}

	public boolean create() throws SQLException {
		Connection con = null;
		Statement stat = null;
		try {
			con = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			stat = con.createStatement();
			String sql = "create table student(`id` int  primary key auto_increment,`name` varchar(100) not null);";
			System.out.println(sql);
			stat.executeUpdate(sql);
			sql = "create table score(`id` int primary key auto_increment, `course` varchar(100) not null,`grade` int not null default 100);";
			System.out.println(sql);
			stat.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (null != stat) {
				stat.close();
			}
			if (null != con) {
				con.close();
			}
		}
	}

	public boolean insert(String table, String cols[], String vals[]) throws SQLException {
		String sql = "insert into " + table + "(";
		for (int i = 0; i < cols.length; i++) {
			if (0 == i) {
				sql += cols[i];
			} else {
				sql += "," + cols[i];
			}
		}
		sql += ") values(";
		for (int i = 0; i < vals.length; i++) {
			if (0 == i) {
				sql += "\"" + vals[i] + "\"";
			} else {
				sql += ",\"" + vals[i] + "\"";
			}
		}
		sql += ")";
		Connection con = null;
		Statement stat = null;
		try {
			con = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			stat = con.createStatement();
			System.out.println(sql);
			stat.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (null != stat) {
				stat.close();
			}
			if (null != con) {
				con.close();
			}
		}
	}

	public boolean select(String table) throws SQLException {
		Connection con = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			stat = con.createStatement();
			String sql = "select * from " + table;
			System.out.println(sql);
			stat.executeQuery(sql);
			rs = stat.getResultSet();
			int cnt = rs.getMetaData().getColumnCount();
			while (rs.next()) {
				System.out.print("\t");
				for (int i = 1; i <= cnt; i++) {
					System.out.print(rs.getObject(i) + " ");
				}
				System.out.println();
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (null != rs) {
				rs.close();
			}
			if (null != stat) {
				stat.close();
			}
			if (null != con) {
				con.close();
			}
		}
	}

	public boolean update(String table, String colName, String newVal) throws SQLException {
		Connection con = null;
		Statement stat = null;
		try {
			con = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			stat = con.createStatement();
			String sql = "update " + table + " set " + colName + "=\"" + newVal + "\"";
			System.out.println(sql);
			stat.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		return false;
		} finally {
			if (null != stat) {
				stat.close();
			}
			if (null != con) {
				con.close();
			}
		}
	}

	public boolean delete(String table) throws SQLException {
		Connection con = null;
		Statement stat = null;
		try {
			con = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			stat = con.createStatement();
			String sql = "delete from  " + table;
			System.out.println(sql);
			stat.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (null != stat) {
				stat.close();
			}
			if (null != con) {
				con.close();
			}
		}
	}
	public boolean drop() throws SQLException {
		Connection con = null;
		Statement stat = null;
		try {
			con = DriverManager.getConnection(DB.MySQLUrl, DB.MySQLUserName, DB.MySQLPassword);
			stat = con.createStatement();
			String sql = "drop table student";
			System.out.println(sql);
			stat.executeUpdate(sql);
			sql = "drop table score";
			System.out.println(sql);
			stat.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (null != stat) {
				stat.close();
			}
			if (null != con) {
				con.close();
			}
		}
	}
}