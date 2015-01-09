import static org.junit.Assert.*;

import org.junit.Test;


public class TestReverse {

	@Test
	public void testReverse0() {
		String str0 = "";
		assertEquals("",reverse.reverse1(str0));
		assertEquals("",reverse.reverse2(str0));
		assertEquals("",reverse.reverse3(str0));
	}
	
	@Test
	public void testReverse1() {
		String str1 = ")";
		assertEquals(")",reverse.reverse1(str1));
		assertEquals(")",reverse.reverse2(str1));
		assertEquals(")",reverse.reverse3(str1));
	}
	
	@Test
	public void testReverse2() {
		String str2 = "abcdefg";
		assertEquals("gfedcba",reverse.reverse1(str2));
		assertEquals("gfedcba",reverse.reverse2(str2));
		assertEquals("gfedcba",reverse.reverse3(str2));
	}

	@Test
	public void testReverse3() {
		String str3 = "abcdefgaa";
		assertEquals("aagfedcba",reverse.reverse1(str3));
		assertEquals("aagfedcba",reverse.reverse2(str3));
		assertEquals("aagfedcba",reverse.reverse3(str3));
	}
	
	@Test
	public void testReverse4() {
		String str4 = "a\bc\\defg11";
		assertEquals("11gfed\\c\ba",reverse.reverse1(str4));
		assertEquals("11gfed\\c\ba",reverse.reverse2(str4));
		assertEquals("11gfed\\c\ba",reverse.reverse3(str4));
	}
	
	@Test
	public void testReverse5() {
		String str5 = "abcdefg.h.1#";
		assertEquals("#1.h.gfedcba",reverse.reverse1(str5));
		assertEquals("#1.h.gfedcba",reverse.reverse2(str5));
		assertEquals("#1.h.gfedcba",reverse.reverse3(str5));
	}
	
	@Test
	public void testReverse6() {
		String str6 = "11111111111ddddddddd$$$$";
		assertEquals("$$$$ddddddddd11111111111",reverse.reverse1(str6));
		assertEquals("$$$$ddddddddd11111111111",reverse.reverse2(str6));
		assertEquals("$$$$ddddddddd11111111111",reverse.reverse3(str6));
	}
}
