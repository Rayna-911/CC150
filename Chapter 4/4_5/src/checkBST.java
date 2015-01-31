
public class checkBST {
	
	public static Integer last=null;
	public static boolean check1(TreeNode n){
		
		if(n==null){
			return true;
		}
		if(!check1(n.getLeft())){
			return false;
		}
		if(last != null && n.getVal()<=last){
			return false;
		}
		last = n.getVal();
		if(!check1(n.getRight())){
			return false;
		}
		return true;
	}
	
	public static boolean check2(TreeNode n){
		if(n==null){
			return true;
		}
		return helper(n, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}
	
	private static boolean helper(TreeNode n, int max, int min){
		if(n==null){
			return true;
		}
		
		if(n.getVal()>max || n.getVal()<=min){
			return false;
		}
		
		return helper(n.getLeft(),n.getVal(),min)&&helper(n.getRight(), max, n.getVal());
	}
}
