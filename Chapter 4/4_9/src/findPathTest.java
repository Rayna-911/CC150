import static org.junit.Assert.*;

import org.junit.Test;


public class findPathTest {

	@Test
	public void test0() {
		int sum0 = 0;
		TreeNode n0 = null;
		System.out.println("case 0");
		findPath.find(n0, sum0);
	}
	
	@Test
	public void test1() {
		int sum1 = 0;
		TreeNode n1 = new TreeNode(-3);
		TreeNode l1 = new TreeNode(3);
		TreeNode ll1 = new TreeNode(4);
		TreeNode lr1 = new TreeNode(-4);
		l1.setLeft(ll1);
		l1.setRight(lr1);
		n1.setLeft(l1);
		System.out.println("case 1");
		findPath.find(n1, sum1);
	}

	@Test
	public void test2() {
		int sum2 = 0;
		TreeNode n2 = new TreeNode(-3);
		TreeNode l2 = new TreeNode(3);
		TreeNode ll2 = new TreeNode(4);
		TreeNode lll2 = new TreeNode(-4);
		l2.setLeft(ll2);
		ll2.setLeft(lll2);
		n2.setLeft(l2);
		System.out.println("case 2");
		findPath.find(n2, sum2);
	}
}
