package test;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import db.DB;
import db.MySql;

@RunWith(Theories.class)
public class DML {
	@DataPoints
	public static String[] tables = new String[] { "student" };
	@DataPoints
	public static DB[] dbs = new DB[] { new MySql() };

	@Theory
	public void testSelect(DB db, String table) {
		try {
			boolean c = db.select(table);
			System.out.println(c);
		} catch (SQLException e) {
			fail("fail");
			e.printStackTrace();
		}
	}

}
