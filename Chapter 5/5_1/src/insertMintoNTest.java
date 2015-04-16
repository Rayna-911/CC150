import static org.junit.Assert.*;

import org.junit.Test;


public class insertMintoNTest {

	@Test
	public void test0() {
		int M0 = 0;
		int N0 = 0;
		assertEquals(insertMintoN.insert(M0,N0,0,0), 0);
	}
	
	@Test
	public void test1() {
		int M1 = 1000;
		int N1 = 11111111;
		assertEquals(insertMintoN.insert(M1,N1,2,5), 0);
	}
	
	@Test
	public void test2() {
		int M2 = 1101;
		int N2 = 1110000;
		assertEquals(insertMintoN.insert(M2,N2,0,3), 1111101);
	}
	
	@Test
	public void test3() {
		int M3 = 10;
		int N3 = 111000000;
		assertEquals(insertMintoN.insert(M3,N3,0,1), 111000010);
	}
}
