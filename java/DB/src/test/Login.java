package test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import db.DB;
import db.MySql;

@RunWith(Parameterized.class)
public class Login {
	private int successCntBeforeError;
	private int errorCnt;
	private int successCntAfterError;
	private DB db;

	public Login(int successCntBeforeError, int errorCnt, int successCntAfterError, Class<? extends DB> dbClass) {
		this.successCntBeforeError = successCntBeforeError;
		this.errorCnt = errorCnt;
		this.successCntAfterError = successCntAfterError;
		try {
			this.db = dbClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Parameters
	public static List<Object[]> addTestParams() {
		return Arrays.asList(new Object[][] {{ 0, 1, 0, MySql.class }});
	}

	@Test
	public void test() {
		System.out.println(getMethodName() + " " + this.db.getClass().getSimpleName());
		for (int i = 0; i < this.successCntBeforeError; i++) {
			System.out.println(this.db.login(true));
		}
		for (int i = 0; i < this.errorCnt; i++) {
			System.out.println(this.db.login(false));
		}
		for (int i = 0; i < this.successCntAfterError; i++) {
			System.out.println(this.db.login(true));
		}
	}

	public static String getMethodName() {
		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
		StackTraceElement e = stacktrace[2];
		String methodName = e.getMethodName();
		return methodName;
	}
}
