
public class BinaryRepre {
	public static String BRepr(double x){
		if(x>=1 || x<=0) return "Error";
		
		StringBuilder b = new StringBuilder();
		b.append(".");
		while(x>0){
			if(b.length()>=32) return "Error";
			double tmp = x*2;
			if(x>=1) {
				b.append("1");
				x = tmp -1;
			}
			else{
				b.append("0");
				x = tmp;
			}
		}
		
		return b.toString();
	}
}
