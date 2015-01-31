
public class isBalanced {
	public static boolean check1(TreeNode n){
		if(n==null){
			return true;
		}
		
		int l = getHeight1(n.getLeft());
		int r = getHeight1(n.getRight());
		
		if(Math.abs(l-r)>1){
			return true;
		}
		else{
			return check1(n.getLeft()) && check1(n.getRight());
		}
	}
	
	private static int getHeight1(TreeNode x){
		if (x==null){
			return 0;
		}
		return 1+Math.max(getHeight1(x.getLeft()), getHeight1(x.getRight()));
	}
	
	// O(nlogn) time
	
	public static boolean check2(TreeNode n){
		if(n==null){
			return true;
		}
		int h = getHeight2(n);
		if(h==-1){
			return false;
		}
		else{
			return true;
		}
	}
	
	private static int getHeight2(TreeNode x){
		if(x == null){
			return 0;
		}
		
		int left = getHeight2(x.getLeft());
		if(left==-1){
			return -1;
		}
		int right = getHeight2(x.getRight());
		if(right == -1){
			return -1;
		}
		
		if(Math.abs(left-right)>1){
			return -1;
		}
		else{
			return 1+Math.max(left,right)+1;
		}
	}
	//O(n) time
}
