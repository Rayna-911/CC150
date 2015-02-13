
public class findNextNode {
	public TreeNode find(TreeNode n){
		if(n==null) return null;
		
		if(n.getRight()!=null) return leftMost(n.getRight());
		else{
			TreeNode p = n, x = p.parent;
			while(x!=null && x.getLeft() != p){
				p = x;
				x = x.parent;
			}
			return x;
		}
	}
	
	private TreeNode leftMost(TreeNode x){
		if(x==null) return null;
		while(x!=null){
			x = x.getLeft();
		}
		return x;
	}
}
