import java.util.ArrayList;
import java.util.LinkedList;


public class DepthList {
	//bfs
	public static ArrayList<LinkedList<TreeNode>> levelList1(TreeNode root){
		ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> sub = new LinkedList<TreeNode>();
		
		if(root!=null){
			sub.add(root);
		}
		
		while(sub.size()!=0){
			res.add(sub);
			LinkedList<TreeNode> curr = sub; 
			sub = new LinkedList<TreeNode>();
			for(TreeNode n : curr){
				if(n.getLeft()!=null){
					sub.add(n.getLeft());
				}
				if(n.getRight()!=null){
					sub.add(n.getRight());
				}
			}
		}
		return res;
	}
	
	//dfs
	public static ArrayList<LinkedList<TreeNode>> levelList2(TreeNode root){
		ArrayList<LinkedList<TreeNode>> res = new ArrayList<LinkedList<TreeNode>>();
		helper(root,res,0);
		return res;
	}
	private static void helper(TreeNode n,ArrayList<LinkedList<TreeNode>> res,int level){
		if(n==null){
			return;
		}
		LinkedList<TreeNode> sub = null;
		if(res.size() == level){
			sub = new LinkedList<TreeNode>();
			res.add(sub);
		}
		else{
			sub = res.get(level);
		}
		
		sub.add(n);
		helper(n.getLeft(),res,level+1);
		helper(n.getRight(),res,level+1);
	}
	
	public static void printRes(ArrayList<LinkedList<TreeNode>> res){
		for(LinkedList<TreeNode> l : res){
			for(TreeNode n: l){
				System.out.print(n.getVal() + "->");
			}
			System.out.println();
		}
	}
}
