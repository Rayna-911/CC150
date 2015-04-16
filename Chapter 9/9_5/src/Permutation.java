import java.util.ArrayList;


public class Permutation {
	public static ArrayList<String> permu(String s){
		if(s==null){
			return null;
		}
		ArrayList<String> res = new ArrayList<String>();
		if(s.length() == 0){
			res.add("");
			return res;
		}
		
		char first = s.charAt(0);
		String remain = s.substring(1);
		ArrayList<String> sub = permu(remain);
		for(String word : sub){
			for(int i = 0; i<word.length()+1; i++){
				String newWord = modify(word, first, i);
				res.add(newWord);
			}
		}
		return res;
	}
	private static String modify(String word, char x, int i){
		return word.substring(0,i)+x+word.substring(i);
	}
	//O(2^n) time
	
	public static void printOut(ArrayList<String> arr){
		for(String s : arr){
			System.out.println(s);
		}
	}
}
