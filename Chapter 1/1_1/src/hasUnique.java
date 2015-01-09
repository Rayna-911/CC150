public class hasUnique {
	
	public static boolean checking1(String str){
		if (str.length() < 2){
			return true;
		}
		
		for(int i = 0; i < str.length(); i++){
			char tmp = str.charAt(i);
			for (int j = i+1; j < str.length(); j++){
				if(tmp == str.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
	//O(n^2) Time & O(1) Space
	
	public static boolean checking2(String str){
		if (str.length() < 2){
			return true;
		}
		
		boolean[] checker = new boolean[256];
		
		for(int i = 0; i < str.length(); i++){
			int tmp = str.charAt(i);
			if(checker[tmp]){
				return false;
			}
			else{
				checker[tmp] = true;
			}
		}
		return true;
	}
	//O(n) Time & O(1) Space	

	public boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i=0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
	// This is the given by CC150 
	// assume that the string only uses the lowercase letters a through z
	// O(n) Time & O(1) Space
}
