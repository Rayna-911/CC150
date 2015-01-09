import junit.framework.TestCase;

import org.junit.Test;


public class TestHasUnique extends TestCase{

	@Test
	public void testchecking0() {
		String str0 = "";
		assertTrue(hasUnique.checking1(str0));
		assertTrue(hasUnique.checking2(str0));
	}
	
	@Test
	public void testchecking1() {
		String str1 = ")";
		assertTrue(hasUnique.checking1(str1));
		assertTrue(hasUnique.checking2(str1));
	}
	
	@Test
	public void testchecking2() {		
		String str2 = "abcdefg";
		assertTrue(hasUnique.checking1(str2));
		assertTrue(hasUnique.checking2(str2));
	}
	
	@Test
	public void testchecking3() {
		String str3 = "abcdefga";
		assertFalse(hasUnique.checking1(str3));
		assertFalse(hasUnique.checking2(str3));
	}
	
	@Test
	public void testchecking4() {
		String str4 = "abcdefg11";
		assertFalse(hasUnique.checking1(str4));
		assertFalse(hasUnique.checking2(str4));
	}
	
	@Test
	public void testchecking5() {
		String str5 = "abcdefg.h.1";
		assertFalse(hasUnique.checking1(str5));
		assertFalse(hasUnique.checking2(str5));
	}
	
	@Test
	public void testchecking6() {
		String str6 = "abcdefg#01";
		assertTrue(hasUnique.checking1(str6));
		assertTrue(hasUnique.checking2(str6));
	}

}
