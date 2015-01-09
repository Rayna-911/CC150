import java.util.Arrays;


public class isPermutationOf {
	
	public static boolean checking1(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		int[] cnt = new int[256]; // assume size is 256
		char[] s = str1.toCharArray();
		
		for(char c: s){
			cnt[c]++;
		}
		
		for(int i = 0; i < str2.length(); i++){
			int tmp = str2.charAt(i);
			--cnt[tmp];
			if(cnt[tmp]<0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checking2(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
		
	public static String sort(String s){
		char[] s_char = s.toCharArray();
		Arrays.sort(s_char);	
		return new String(s_char);
	}
	
	public static void main(String[] args) {
		}
}

