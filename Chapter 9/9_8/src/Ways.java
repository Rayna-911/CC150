
public class Ways {
	public static int makeChange1(int n){
		int[] type = {25,10,5,1};
		if(n<=0){
			return 0;
		}
		return helper1(n,type,0);
	}
	private static int helper1(int n, int[] type, int index){
		if(index>=type.length-1){
			return 1; // this way is use 1 cent
		}
		int amount = type[index];
		int way = 0;
		for(int i = 0 ; i *amount<=n; i++){
			int remain = n - i*amount;
			way += helper1(remain, type, index+1);
		}
		return way;
	}
	
	public static int makeChange2(int n){
		if(n<=0){
			return 0;
		}
		int[] type = {25,10,5,1};
		int[][] map = new int[n+1][type.length];
		return helper2(n,type,0,map);
	}
	private static int helper2(int n, int[] type, int index, int[][] map){
		if(map[n][index]>0){
			return map[n][index];
		}
		if(index>=type.length-1){
			return 1; // this way is use 1 cent
		}
		int amount = type[index];
		int way = 0;
		for(int i = 0 ; i *amount<=n; i++){
			int remain = n - i*amount;
			way += helper2(remain, type, index+1,map);
		}
		map[n][index] = way;
		return way;
	}
}
