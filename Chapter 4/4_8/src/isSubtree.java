
public class isSubtree {
	//check if t2 is a subtree of t1
	public static boolean checkSubtree(TreeNode t1, TreeNode t2){
		if(t2 == null){
			return true;
		}
		return subtree(t1, t2);
	}
	
	private static boolean subtree(TreeNode r1, TreeNode r2){
		if(r1 == null){
			return false;
		}
		if(r1.getVal() == r2.getVal()){
			if(rec(r1,r2)) return true;
		}
		return subtree(r1.getLeft(),r2) || subtree(r1.getRight(),r2);
	}
	
	private static boolean rec(TreeNode r1, TreeNode r2){
		if(r1==null && r2 == null) return true;
		if(r1==null || r2 == null) return false;
		if(r1.getVal()!=r2.getVal()) return false;
		return (rec(r1.getLeft(),r2.getLeft()) && rec(r1.getRight(),r2.getRight()));
	}
}
