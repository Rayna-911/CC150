import junit.framework.TestCase;

import org.junit.Test;


public class TestreplaceSpace extends TestCase{

	@Test
	public void testReplaceSpace0() {
		String str0 = "";
		assertEquals("",replaceSpace.replaceSpace1(str0));
		assertEquals("",replaceSpace.replaceSpace2(str0));
	}
	
	@Test
	public void testReplaceSpace1() {
		String str1 = " ";
		assertEquals("%20",replaceSpace.replaceSpace1(str1));
		assertEquals("%20",replaceSpace.replaceSpace2(str1));
	}
	
	@Test
	public void testReplaceSpace2() {
		String str2 = "   ";
		assertEquals("%20%20%20",replaceSpace.replaceSpace1(str2));
		assertEquals("%20%20%20",replaceSpace.replaceSpace2(str2));
	}
	
	@Test
	public void testReplaceSpace3() {
		String str3 = "Hello World! ";
		assertEquals("Hello%20World!%20",replaceSpace.replaceSpace1(str3));
		assertEquals("Hello%20World!%20",replaceSpace.replaceSpace2(str3));
	}
	
	@Test
	public void testReplaceSpace4() {
		String str4 = "\\ \' Hi! ";
		assertEquals("\\%20\'%20Hi!%20",replaceSpace.replaceSpace1(str4));
		assertEquals("\\%20\'%20Hi!%20",replaceSpace.replaceSpace2(str4));
	}
	
	@Test
	public void testReplaceSpace5() {
		String str5 = "123 abc * *";
		assertEquals("123%20abc%20*%20*",replaceSpace.replaceSpace1(str5));
		assertEquals("123%20abc%20*%20*",replaceSpace.replaceSpace2(str5));
	}

}
