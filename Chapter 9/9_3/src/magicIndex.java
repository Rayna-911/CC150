
public class magicIndex {
	public static int findIndex1(int[] arr){
		if(arr.length == 0){
			return -1;
		}
		
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<=hi){
			int mid = lo+(hi-lo)/2;
			if(arr[mid] < mid) lo = mid+1;
			else if(arr[mid] > mid) hi = mid-1;
			else return mid;
		}
		
		return -1;
	}
	
	public static int findIndex2(int[] arr){
		return helper(arr,0,arr.length-1);
	}
	
	private static int helper(int[] arr, int start, int end){
		if(start<0 || end>arr.length-1 ||start>end){
			return -1;
		}
		
		int mid = start+(end-start)/2;
		if(arr[mid] == mid){
			return mid;
		}
		
		int leftRange = Math.min(mid-1, arr[mid]);//narrow down the range
		int left = helper(arr,start, leftRange);
		if(left>=0){
			return left;
		}
		
		int rightRange = Math.max(mid+1,arr[mid]);
		int right = helper(arr, rightRange, end);
		return right;
	}
}
