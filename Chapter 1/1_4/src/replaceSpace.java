
public class replaceSpace {
	
	public static String replaceSpace1(String str){
		StringBuffer buff = new StringBuffer();
		for(int i = 0; i < str.length(); i++){
			if(Character.isWhitespace(str.charAt(i))){
				buff.append("%20");
			}
			else{
				buff.append(str.charAt(i));
			}
		}
		return buff.toString();
	}
	
	public static String replaceSpace2(String str){
		char[] new_str;
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' ' ){
				cnt++;
			}
		}
		
		int j = 0;
		new_str = new char[str.length()+cnt*2];
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' ' ){
				new_str[j++] = '%';
				new_str[j++] = '2';
				new_str[j++] = '0';
			}
			else{
				new_str[j++] = str.charAt(i);
			}
		}
		return new String(new_str);
	}
	
	public static void main(String[] args){
		String str = "I WILL BE FINE!";
		System.out.println(replaceSpace.replaceSpace1(str));
		System.out.println(replaceSpace.replaceSpace2(str));
	}
}
