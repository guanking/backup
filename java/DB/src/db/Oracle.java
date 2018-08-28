package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle extends DB {
	public boolean login(boolean loginSuccess) {
		Connection con = null;
		try {
			if (loginSuccess) {
				con = DriverManager.getConnection(DB.OracleUrl, DB.OracleUserName, DB.OraclePassword);
			} else {
				con = DriverManager.getConnection(DB.OracleUrl, DB.OracleUserName, "fd4ag45safd");
			}
		} catch (SQLException e) {
			return false;
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	@Override
	public boolean select(String table) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean create() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(String table, String[] cols, String[] vals) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String table, String colName, String newVal) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String table) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drop() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
