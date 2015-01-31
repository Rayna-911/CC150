
public class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public int getVal(){
		return this.data;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public void setLeft(TreeNode n){
		this.left = n;
	}
	
	public void setRight(TreeNode n){
		this.right = n;
	}
	
}
