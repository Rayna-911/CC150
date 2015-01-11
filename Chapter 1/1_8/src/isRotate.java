
public class isRotate {
	public static boolean isRotate1(String s, String t){
		
		if(s.length() == t.length() && t.length()>0){
			s = s+s;
			return isSubString(s,t);
		}
		return false;
	}
	
	public static boolean isSubString(String s, String t){
		return s.contains(t);
	}

}
