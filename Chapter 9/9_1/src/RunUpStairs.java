
public class RunUpStairs {
	//f(n) = f(n-1)+f(n-2)+f(n-3)
	public static int cal1(int n){
		if(n<0){
			return 0;
		}
		
		if(n<2){
			return 1;
		}
		
		int[] res = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;
		
		for(int i = 3; i<n+1; i++){
			res[i] = res[i-1]+res[i-2]+res[i-3];
		}

		return res[n];
	}
}
