import java.util.Arrays;


public class minHeightBST {
	public static TreeNode build1(int[] arr){
		return helper(arr, 0, arr.length);
	}
	
	private static TreeNode helper(int[] arr,int start, int end){
		if(start>end) return null;
		
		int mid = start+(start+end)/2;
		TreeNode root = new TreeNode(mid);
		root.setLeft(helper(arr, start, mid-1));
		root.setRight(helper(arr, mid+1, end));
		return root;
	}
	
	public static void printTree(TreeNode n){
		if(n!=null){
			printTree(n.getLeft());
			System.out.println(n.getVal());
			printTree(n.getRight());
		}
	}
}
