
public class insertMintoN {
	public static int insert(int M, int N, int i, int j){
		int allones = ~0;
		int left = allones << (j+1);
		int right = (1 << i)-1;
		int mask = left | right; // | tonghuo
		int clearedN = N & mask;
		int M_shifted = M << i;
		return clearedN | M_shifted;
		
	}
}
