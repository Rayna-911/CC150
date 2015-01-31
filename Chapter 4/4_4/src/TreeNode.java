
public class TreeNode {
	private int val;
	private TreeNode left,right;
	
	public TreeNode(int val){
		this.val = val;
	}
	
	public void setVal(int val){
		this.val = val;
	}
	
	public void setLeft(TreeNode l){
		this.left = l;
	}
	
	public void setRight(TreeNode r){
		this.right = r;
	}
	
	public int getVal(){
		return val;
	}
	public TreeNode getLeft(){
		return left;
	}
	
	public TreeNode getRight(){
		return right;
	}
}

