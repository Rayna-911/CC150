import java.util.Hashtable;


public class removeDuplicate {
	
	public static void remove1(LinkedListNode n) {
		
		Hashtable<Integer, Boolean> table = new Hashtable<Integer,Boolean>();
		
		LinkedListNode previous = null;
		 
		while (n != null) {
		
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
				n = n.next;
		 }
	}
	//O(n) time
	
	public static void remove2(LinkedListNode n) {
		
		if(n==null || n.next==null){
			return;
		}
		 
		while (n != null) {
			LinkedListNode tmp = n;
			while (tmp.next != null){
				if (tmp.next.data==n.data) {
					tmp.next = tmp.next.next;
				} else {
					tmp=tmp.next;
				}
			}
			n = n.next;
		 }
	}
	//O(n^2) time O(1)space
	
	
}
