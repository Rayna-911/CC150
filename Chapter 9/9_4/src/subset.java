import java.util.ArrayList;


public class subset {
	//index should start from 0
	public static ArrayList<ArrayList<Integer>> findSubset1(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> res;
		if(set.size() == index){
			res = new ArrayList<ArrayList<Integer>>();
			res.add(new ArrayList<Integer>());
		}
		else{
			res = findSubset1(set,index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> additional = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> sub : res){
				ArrayList<Integer> newsub = new ArrayList<Integer>();
				newsub.addAll(sub);
				newsub.add(item);
				additional.add(newsub);
			}
			res.addAll(additional);
		}
		return res;
	}
	//O(2^n)
	
	//bit manipulation
	public static ArrayList<ArrayList<Integer>> findSubset2(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		int max = 1<<set.size();
		for(int i = 0; i<max;i++){
			ArrayList<Integer> sub = helper(set,i);
			res.add(sub);
		}
		return res;
	}
	private static ArrayList<Integer> helper(ArrayList<Integer> set, int k){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int index = 0;
		for(int i = k; i>0; i>>=1){
			if((i&1)==1){
				tmp.add(set.get(index));
			}
			index++;
		}
		return tmp;
	}//O(2^n)
}
	

