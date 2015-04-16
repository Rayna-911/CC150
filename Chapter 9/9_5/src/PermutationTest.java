import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PermutationTest {

	@Test
	public void test0() {
		String s0 = "";
		ArrayList<String> r0 = Permutation.permu(s0);
		System.out.println("case 0");
		Permutation.printOut(r0);
	}
	
	@Test
	public void test1() {
		String s1 = "a";
		ArrayList<String> r1 = Permutation.permu(s1);
		System.out.println("case 1");
		Permutation.printOut(r1);
	}
	
	@Test
	public void test2() {
		String s2 = "ab";
		ArrayList<String> r2 = Permutation.permu(s2);
		System.out.println("case 2");
		Permutation.printOut(r2);
	}
	
	@Test
	public void test3() {
		String s3 = "ab1";
		ArrayList<String> r3 = Permutation.permu(s3);
		System.out.println("case 3");
		Permutation.printOut(r3);
	}

}
