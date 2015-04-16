import static org.junit.Assert.*;

import org.junit.Test;


public class RunUpStairsTest {

	@Test
	public void test0() {
		assertEquals(1,RunUpStairs.cal1(0));
	}

	@Test
	public void test1() {
		assertEquals(1,RunUpStairs.cal1(1));
	}
	
	@Test
	public void test2() {
		assertEquals(2,RunUpStairs.cal1(2));
	}
	
	@Test
	public void test3() {
		assertEquals(4,RunUpStairs.cal1(3));
	}
}
