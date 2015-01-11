import junit.framework.TestCase;

import org.junit.Test;


public class TestIsRotate extends TestCase{

	@Test
	public void testIsRotate0() {
		String s0 = "";
		String t0 = "";
		assertFalse(isRotate.isRotate1(s0,t0));
	}

	@Test
	public void testIsRotate1() {
		String s1 = "abc";
		String t1 = "abcd";
		assertFalse(isRotate.isRotate1(s1,t1));
	}

	@Test
	public void testIsRotate2() {
		String s2 = "abcd";
		String t2 = "cdab";
		assertTrue(isRotate.isRotate1(s2,t2));
	}

	@Test
	public void testIsRotate3() {
		String s3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String t3 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		assertTrue(isRotate.isRotate1(s3,t3));
	}

	@Test
	public void testIsRotate4() {
		String s4 = "ss  oo  !!";
		String t4 = "oo  !!  ss";
		assertFalse(isRotate.isRotate1(s4,t4));
	}

}
