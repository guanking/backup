package test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import db.DB;
import db.MySql;
import db.Oracle;
import db.SQLServer;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(Parameterized.class)
public class Detect {
	private DB db;

	public Detect(DB db) {
		this.db = db;
	}

	@Parameters
	public static List<Object[]> getParameters() {
//		return Arrays.asList(new Object[][] { { new MySql() }, { new Oracle() }, { new SQLServer() } });
		return Arrays.asList(new Object[][] { { new MySql() } });
	}

	@Test
	public void login() {
		System.out.println(this.db.getClass().getName());
		assertTrue(this.db.login(true));
	}
}
