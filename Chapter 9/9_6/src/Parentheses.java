import java.util.ArrayList;


public class Parentheses {
	public static ArrayList<String> gen1(int n){
		ArrayList<String> res = new ArrayList<String>(); // if use hashset, it can check duplicates automatically
		if(n<=0){
			return res;
		}
		if(n==1){
			res.add("()");
			return res;
		}
		ArrayList<String> last = gen1(n-1);
		for(String s : last){
			for (int i = 0; i<s.length();i++){
				if(s.charAt(i) == '('){
					String newS = insert(s,i);
					if(!res.contains(newS)){
						res.add(newS);
					}
				}
			}
			if(!res.contains("()"+s)){
				res.add("()"+s);
			}
		}
		return res;
	}
	private static String insert(String s, int i){
		return s.substring(0,i+1) + "()" +s.substring(i+1);
	}
	// because of generating duplicates, it wastes time.
	
	public static ArrayList<String> gen2(int n){
		char[] tmp = new char[n*2];
		ArrayList<String> res = new ArrayList<String>();
		helper(0,n,n,tmp,res);
		return res;
	}
	
	private static void helper(int curr, int left, int right, char[] tmp, ArrayList<String> res){
		if(left<0 || left>right){
			return;
		}
		
		if(left == 0 && right == 0){
			res.add(String.copyValueOf(tmp));
		}
		else{
			if(left>0){
				tmp[curr] = '(';
				helper(curr+1,left-1,right,tmp,res);
			}
			if(right>0){
				tmp[curr] = ')';
				helper(curr+1,left,right-1,tmp,res);
			}
		}
	}
	
	public static void printOut(ArrayList<String> arr){
		for(String s : arr){
			System.out.println(s);
		}
	}
	
}
