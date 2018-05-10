/**
 * 
 */
package leetcodeprac.Q0xx.Q06x;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author user
 *
 */
public class Q067AddBInaryTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Q067AddBinary q = new Q067AddBinary();
		String a = "10011";
		String b = "1";
		String c = "001";
		String d = "111101";
		System.out.println(q.addBinary(a, b));
		System.out.println(q.addBinary(b, c));
		System.out.println(q.addBinary(b, ""));
		System.out.println(q.addBinary(a, d));
		System.out.println(q.addBinary("", ""));
		
	}

}
