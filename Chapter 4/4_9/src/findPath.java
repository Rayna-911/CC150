
public class findPath {
	//convert end to start
	public static void find(TreeNode n, int sum){
		
		if(n==null){
			return;
		}
		
		int h = getHeight(n);
		int[] path = new int[h];
		
		helper(n,sum,path,0);
	}
	
	private static void helper(TreeNode n, int sum, int[] path, int level){
		if(n==null){
			return;
		}
		
		int tmp = 0;
		path[level] = n.getVal();
		
		for(int i = level; i>-1; i--){
			tmp += path[i];
			if(tmp == sum){
				modify(i,path,level);
			}
		}
		
		helper(n.getLeft(),sum,path,level+1);
		helper(n.getRight(),sum,path,level+1);
	}
	
	private static void modify(int num, int[] path, int level){
		for(int i = num; i<level+1; i++){
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}
	private static int getHeight(TreeNode n){
		if(n == null){
			return 0;
		}
		return 1+Math.max(getHeight(n.getLeft()), getHeight(n.getRight()));
	}
}
