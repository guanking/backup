package test;

import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Test {
	@DataPoints
	static public String accounts[] = new String[] { "cao", "guan", "jie" };
	@DataPoints
	static public String passwords[] = new String[] { "1", "2", "3" };

	static boolean contain(String[] strs, String str) {
		for (String e : strs) {
			if (str.equals(e)) {
				return true;
			}
		}
		return false;
	}

	@Theory
	public void test(String account, String password) {
		assumeTrue(contain(accounts, account) && contain(passwords, password));
		System.out.println("account : " + account + "\tpassword:" + password);
	}

}
