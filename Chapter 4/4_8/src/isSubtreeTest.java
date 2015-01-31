import static org.junit.Assert.*;

import org.junit.Test;


public class isSubtreeTest {

	@Test
	public void test0() {
		TreeNode t10 = null;
		TreeNode t20 = null;
		assertTrue(isSubtree.checkSubtree(t10, t20));
	}

	@Test
	public void test1() {
		TreeNode t11 = new TreeNode(11);
		TreeNode t21 = null;
		assertTrue(isSubtree.checkSubtree(t11, t21));
	}
	
	@Test
	public void test2() {
		TreeNode t12 = new TreeNode(12);
		TreeNode t12l = new TreeNode(1);
		TreeNode t12r = new TreeNode(2);
		t12.setLeft(t12l);
		t12.setRight(t12r);
		TreeNode t22 = new TreeNode(22);
		assertFalse(isSubtree.checkSubtree(t12, t22));
	}
	
	@Test
	public void test3() {
		TreeNode t13 = new TreeNode(120);
		TreeNode t13l = new TreeNode(125);
		TreeNode t13r = new TreeNode(90);
		t13.setLeft(t13l);
		t13.setRight(t13r);
		TreeNode t23 = new TreeNode(125);
		assertTrue(isSubtree.checkSubtree(t13, t23));
	}
}
