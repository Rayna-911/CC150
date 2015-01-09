public class stringCompression {

	public static String stringCompression1(String s){
		if(s == ""){
			return s;
		}
		
		String res = "";
		int cnt = 1, j = 0;
		
		res += s.charAt(0);
		
		for(int i = 1; i < s.length(); i++){
			if(res.lastIndexOf(s.charAt(i)) == j){
				cnt++;
			}
			else{
				res += cnt;
				res += s.charAt(i);
				cnt = 1;
				j += 2;
			}
		}
		res += cnt;
		
		if(res.length() >= s.length()){
			return s;
		}
		else{
			return res;
		}
	}

	public static String stringCompression2(String s){
		
		if(s == ""){
			return s;
		}
		
		char[] arr = new char[s.length()];
		arr[0] = s.charAt(0);
		int cnt = 0, index = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == arr[index]){
				cnt++;
			}
			else{
				index++;
				
				if(index + 1 >= s.length()){
					return s;
				}
				
				arr[index++] = (char)(cnt+'0');
				arr[index] = s.charAt(i);
				cnt = 1;
			}
		}
		if( (++index) + 1 >= s.length()){
			return s;
		}
		else{
			arr[index] = (char)(cnt+'0');
			return new String(arr,0,++index);
		}
	}
	
	public static void main(String[] args){
		String s = "aabcccccaaa";
		System.out.println(stringCompression1(s));
		String s1 = "123abcc0";
		System.out.println(stringCompression2(s1));
	}
}
