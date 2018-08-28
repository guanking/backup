package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServer extends DB{
	public boolean login(boolean successLogin) {
		Connection con = null;
		try {
			if (successLogin) {
				con = DriverManager.getConnection(DB.SQLServerUrl, DB.SQLServerUserName, DB.SQLServerPassword);
			} else {
				con = DriverManager.getConnection(DB.SQLServerUrl, DB.SQLServerUserName, "1d2er5tr");
			}
		} catch (Exception e) {
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
