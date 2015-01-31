import static org.junit.Assert.*;

import org.junit.Test;


public class minHeightBSTTest {

	@Test
	public void test0() {
		int[] arr0 = {};
		TreeNode res0 = minHeightBST.build1(arr0);
		System.out.println("case 0");
		minHeightBST.printTree(res0);
	}
	
	@Test
	public void test1() {
		int[] arr1 = {0};
		TreeNode res1 = minHeightBST.build1(arr1);
		System.out.println("case 1");
		minHeightBST.printTree(res1);
	}
	
	@Test
	public void test2() {
		int[] arr2 = {1,2};
		TreeNode res2 = minHeightBST.build1(arr2);
		System.out.println("case 2");
		minHeightBST.printTree(res2);
	}
	
	@Test
	public void test3() {
		int[] arr3 = {1,2,3};
		TreeNode res3 = minHeightBST.build1(arr3);
		System.out.println("case 3");
		minHeightBST.printTree(res3);
	}
	
	@Test
	public void test4() {
		int[] arr4 = {1,2,7,10,12};
		TreeNode res4 = minHeightBST.build1(arr4);
		System.out.println("case 4");
		minHeightBST.printTree(res4);
	}
}
