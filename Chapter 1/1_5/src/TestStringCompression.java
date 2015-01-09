import junit.framework.TestCase;

import org.junit.Test;


public class TestStringCompression extends TestCase{

	@Test
	public void testStringCompression0() {
		String s0 = "";
		assertEquals("",stringCompression.stringCompression1(s0));
		assertEquals("",stringCompression.stringCompression2(s0));
	}
	
	@Test
	public void testStringCompression1() {
		String s1 = "a";
		assertEquals("a",stringCompression.stringCompression1(s1));
		assertEquals("a",stringCompression.stringCompression2(s1));
	}
	
	@Test
	public void testStringCompression2() {
		String s2 = "aa";
		assertEquals("aa",stringCompression.stringCompression1(s2));
		assertEquals("aa",stringCompression.stringCompression2(s2));
	}
	
	@Test
	public void testStringCompression3() {
		String s3 = "aab";
		assertEquals("aab",stringCompression.stringCompression1(s3));
		assertEquals("aab",stringCompression.stringCompression2(s3));
	}
	
	@Test
	public void testStringCompression4() {
		String s4 = "888";
		assertEquals("83",stringCompression.stringCompression1(s4));
		assertEquals("83",stringCompression.stringCompression2(s4));
	}
	
	@Test
	public void testStringCompression5() {
		String s5 = "123abcc0";
		assertEquals("123abcc0",stringCompression.stringCompression1(s5));
		assertEquals("123abcc0",stringCompression.stringCompression2(s5));
	}
	
	@Test
	public void testStringCompression6() {
		String s6 = "1122233hellooooohiiii";
		assertEquals("122332h1e1l2o5h1i4",stringCompression.stringCompression1(s6));
		assertEquals("122332h1e1l2o5h1i4",stringCompression.stringCompression2(s6));
	}

}
