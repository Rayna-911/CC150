import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class ParenthesesTest {

	@Test
	public void test0() {
		ArrayList<String> r0 = Parentheses.gen2(0);
		System.out.println("case 0");
		Parentheses.printOut(r0);
	}
	
	@Test
	public void test1() {
		ArrayList<String> r1 = Parentheses.gen2(1);
		System.out.println("case 1");
		Parentheses.printOut(r1);
	}
	
	@Test
	public void test2() {
		ArrayList<String> r2 = Parentheses.gen1(2);
		System.out.println("case 2");
		Parentheses.printOut(r2);
	}
	
	@Test
	public void test3() {
		ArrayList<String> r3 = Parentheses.gen2(4);
		System.out.println("case 3");
		Parentheses.printOut(r3);
	}

}
