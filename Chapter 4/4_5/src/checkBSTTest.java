import static org.junit.Assert.*;

import org.junit.Test;


public class checkBSTTest {

	@Test
	public void test0() {
		TreeNode t0 = null;
		assertTrue(checkBST.check1(t0));
		assertTrue(checkBST.check2(t0));
	}

	@Test
	public void test1() {
		TreeNode t1 = new TreeNode(1);
		t1.setLeft(new TreeNode(10));
		assertFalse(checkBST.check1(t1));
		assertFalse(checkBST.check2(t1));
	}
	
	@Test
	public void test2() {
		TreeNode t2 = new TreeNode(5);
		TreeNode l2 = new TreeNode(3);
		TreeNode ll2 = new TreeNode(4);
		l2.setLeft(ll2);
		t2.setLeft(l2);
		assertFalse(checkBST.check1(t2));
		assertFalse(checkBST.check2(t2));
		
	}
	
	@Test
	public void test3() {
		TreeNode t3 = new TreeNode(35);
		TreeNode l3 = new TreeNode(33);
		TreeNode ll3 = new TreeNode(31);
		l3.setLeft(ll3);
		t3.setLeft(l3);
		assertTrue(checkBST.check1(t3));
		assertTrue(checkBST.check2(t3));
	}
	
	@Test
	public void test4() {
		TreeNode t4 = new TreeNode(45);
		TreeNode l4 = new TreeNode(43);
		TreeNode r4 = new TreeNode(16);
		TreeNode ll4 = new TreeNode(40);
		l4.setLeft(ll4);
		t4.setLeft(l4);
		t4.setRight(r4);
		assertFalse(checkBST.check1(t4));
		assertFalse(checkBST.check2(t4));
	}
}
