
public class reverse {
	public static String reverse1(String str){
		int len = str.length();
		char[] res = new char[len];
		for(int i = len-1; i >-1; i--){
			res[len-i-1] = str.charAt(i);
		}
		return String.valueOf(res);
	}
	//O(n) Time & O(n) Space
	
	public static String reverse2(String str){
		StringBuffer buff = new StringBuffer(str);
		return buff.reverse().toString();
	}
	
	public static String reverse3(String str){
		StringBuilder build = new StringBuilder(str);
		return build.reverse().toString();
	}
}
