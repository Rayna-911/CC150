import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;


public class DepthListTest {

	@Test
	public void test0() {
		TreeNode t0 = null;
		ArrayList<LinkedList<TreeNode>> res0 = DepthList.levelList1(t0);
		System.out.println("case 0");
		DepthList.printRes(res0);
	}

	@Test
	public void test1() {
		TreeNode t1 = new TreeNode(1);
		TreeNode tl1 = new TreeNode(2);
		TreeNode tr1 = new TreeNode(3);
		t1.setLeft(tl1);
		t1.setRight(tr1);
 		ArrayList<LinkedList<TreeNode>> res1 = DepthList.levelList1(t1);
		System.out.println("case 1");
		DepthList.printRes(res1);
	}
	
	@Test
	public void tes2() {
		TreeNode t2 = new TreeNode(10);
		TreeNode tl2 = new TreeNode(20);
		TreeNode tll2 = new TreeNode(30);
		t2.setLeft(tl2);
		tl2.setRight(tll2);
 		ArrayList<LinkedList<TreeNode>> res2 = DepthList.levelList1(t2);
		System.out.println("case 2");
		DepthList.printRes(res2);
	}
}
