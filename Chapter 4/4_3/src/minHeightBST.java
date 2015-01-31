import java.util.Arrays;


public class minHeightBST {
	public static TreeNode build1(int[] arr){
		return helper(arr,0,arr.length-1);
	}
	
	private static TreeNode helper(int[] arr,int start, int end){
		if(start>end){
			return null;
		}
		
		int tmp = (start+end)/2;
		TreeNode root = new TreeNode(arr[tmp]);
		root.setLeft(helper(arr, start, tmp-1));
		root.setRight(helper(arr, tmp+1, end));
		
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
