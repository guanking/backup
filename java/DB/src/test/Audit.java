package test;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import db.DB;
import db.MySql;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(Parameterized.class)
public class Audit {
	private DB db;
	private String table;
	private String[][] insert = new String[][] { { "name" }, { "caoguanjie" } };
	private String[] update = new String[] { "name", "myt" };

	public Audit(DB db, String table, String[][] insert, String[] update) {
		super();
		this.db = db;
		this.table = table;
		this.insert = insert;
		this.update = update;
	}

	@Parameters
	public static List<Object[]> getParameters() {
		return Arrays.asList(new Object[][] {
				{ new MySql(), "student", new String[][] { { "name" }, { "caoguanjie" } },
						new String[] { "name", "myt" } },
				{ new MySql(), "score", new String[][] { { "course", "grade" }, { "math", "86" } },
						new String[] { "grade", "100" } } });
	}

	@Test
	public void test1Create() throws SQLException {
		assertTrue(this.db.create());
	}

	@Test
	public void test2Insert() throws SQLException {
		assertTrue(this.db.insert(this.table, this.insert[0], this.insert[1]));
	}

	@Test
	public void test3Select() throws SQLException {
		assertTrue(this.db.select(this.table));
	}

	@Test
	public void test4Update() throws SQLException {
		assertTrue(this.db.update(this.table, this.update[0], this.update[1]));
	}

	@Test
	public void test5Delete() throws SQLException {
		assertTrue(this.db.delete(this.table));
	}

	@Test
	public void test6Drop() throws SQLException {
		assertTrue(this.db.drop());
	}
}
