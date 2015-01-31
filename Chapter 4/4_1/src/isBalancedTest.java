import static org.junit.Assert.*;

import org.junit.Test;


public class isBalancedTest {
	
	@Test
	public void test0() {
		TreeNode t0 = null;	
		assertTrue(isBalanced.check2(t0));
	}
	
	@Test
	public void test1() {
		TreeNode t1 = new TreeNode(1);
		t1.setLeft(new TreeNode(2));
		assertFalse(isBalanced.check2(t1));
	}
	
	@Test
	public void test2() {
		TreeNode t2 = new TreeNode(1);
		TreeNode l = new TreeNode(2);
		l.setLeft(new TreeNode(3));
		t2.setLeft(l);
		assertFalse(isBalanced.check2(t2));
	}

}
