import junit.framework.TestCase;

import org.junit.Test;


public class TestIsPermutationOf extends TestCase{

	@Test
	public void testIsPermutationOf0(){
		String s0 = "";
		String t0 = "";
		assertTrue(isPermutationOf.checking1(s0, t0));
		assertTrue(isPermutationOf.checking2(s0, t0));
	}
	
	@Test
	public void testIsPermutationOf1(){
		String s1 = "";
		String t1 = "abs";
		assertFalse(isPermutationOf.checking1(s1, t1));
		assertFalse(isPermutationOf.checking2(s1, t1));
	}

	@Test
	public void testIsPermutationOf2(){
		String s2 = "12forever";
		String t2 = "1everfor2";
		assertTrue(isPermutationOf.checking1(s2, t2));
		assertTrue(isPermutationOf.checking2(s2, t2));
	}
	
	@Test
	public void testIsPermutationOf3(){
		String s3 = "helloworld";
		String t3 = "hello world";
		assertFalse(isPermutationOf.checking1(s3, t3));
		assertFalse(isPermutationOf.checking2(s3, t3));
	}
	
	@Test
	public void testIsPermutationOf4(){
		String s4 = "hello@_@world!+";
		String t4 = "he!roll@w_@old";
		assertFalse(isPermutationOf.checking1(s4, t4));
		assertFalse(isPermutationOf.checking2(s4, t4));
	}
	
	@Test
	public void testIsPermutationOf5(){
		String s5 = "hello@_@world!";
		String t5 = "I will be fine";
		assertFalse(isPermutationOf.checking1(s5, t5));
		assertFalse(isPermutationOf.checking2(s5, t5));
	}
}
