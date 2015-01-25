import java.util.ArrayList;
import java.util.HashMap;


public class findkth {
	
	public static LinkedListNode findkth1(LinkedListNode n,int k){
		LinkedListNode p1,p2;
		if(k<=0){
			return null;
		}
		
		p1 = n;
		p2 = n;
		
		while(k>0){
			if(p1 == null){
				return null;
			}
			p1 = p1.next;
			k--;
		}
		if(p2==null){
			return null;
		}
		while(p1.next!=null){
			p1= p1.next;
			p2= p2.next;
		}
		return p2;
	}
	// iterative O(n) time O(1) space	    
}
