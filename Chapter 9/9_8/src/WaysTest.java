import static org.junit.Assert.*;

import org.junit.Test;


public class WaysTest {

	@Test
	public void test0() {
		assertEquals(0,Ways.makeChange1(0));
	}
	
	@Test
	public void test1() {
		assertEquals(1,Ways.makeChange1(1));
	}
	
	@Test
	public void test2() {
		assertEquals(1,Ways.makeChange2(2));
	}
	
	@Test
	public void test3() {
		assertEquals(4,Ways.makeChange2(10));
	}

}
