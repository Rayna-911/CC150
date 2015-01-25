
public class firstCommonAncestor {
	public TreeNode CommonAncestor(TreeNode root,TreeNode p, TreeNode q){
		if(root == null || !isCover(root,p) || !isCover(root,q)){
			return null;
		}
		return helper(root,p,q);		
	}
	
	public TreeNode helper(TreeNode root,TreeNode p, TreeNode q){
		if(root==null){
			return null;
		}
		if(root==p||root==q){
			return root;
		}
		
		boolean p_on_left = isCover(root.getLeft(),p);
		boolean q_on_left = isCover(root.getLeft(),q);
		
		if (p_on_left != q_on_left){
			return root;
		}
		else{
			TreeNode child = p_on_left?root.getLeft():root.getRight();
			return helper(child,p,q);
		}
	}
	
	public boolean isCover(TreeNode root, TreeNode p){
		if(root==null){
			return false;
		}
		if(root==p){
			return true;
		}
		return (isCover(root.getLeft(),p)||isCover(root.getRight(),p));
	}
}
//O(n) time
