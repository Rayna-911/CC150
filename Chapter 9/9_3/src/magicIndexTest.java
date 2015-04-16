import static org.junit.Assert.*;

import org.junit.Test;


public class magicIndexTest {

	@Test
	public void test0() {
		int[] arr0 = {};
		assertEquals(-1,magicIndex.findIndex1(arr0));
	}
	
	@Test
	public void test1() {
		int[] arr1 = {0};
		assertEquals(0,magicIndex.findIndex1(arr1));
	}
	
	@Test
	public void test2() {
		int[] arr2 = {-1,0,2};
		assertEquals(2,magicIndex.findIndex1(arr2));
	}
	
	@Test
	public void test3() {
		int[] arr3 = {-9,-7,-5,3,8,10};
		assertEquals(3,magicIndex.findIndex1(arr3));
	}
	
	@Test
	public void test4() {
		int[] arr4 = {-1,2,3};
		assertEquals(-1,magicIndex.findIndex1(arr4));
	}
	
	@Test
	public void test5() {
		int[] arr5 = {-1,-1,2,3};
		assertEquals(2,magicIndex.findIndex2(arr5));
	}
	
	@Test
	public void test6() {
		int[] arr6 = {-1,2,2,2,3};
		assertEquals(2,magicIndex.findIndex2(arr6));
	}
	
	@Test
	public void test7() {
		int[] arr7 = {1,1,1,1,1};
		assertEquals(1,magicIndex.findIndex2(arr7));
	}

}
