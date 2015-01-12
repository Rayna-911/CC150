import java.util.Hashtable;


public class removeDuplicate {
	
	public static void remove1(LinkedListNode n) {
		
		Hashtable table = new Hashtable();
		
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
	
	
}
class LinkedListNode{
	int data;
	LinkedListNode next;
	
	public LinkedListNode(int n){
		this.data = n;
		this.next = null;
	}
	void print(){
		String s = "";
		LinkedListNode n = this;
		while(n != null){
			s += String.valueOf(n.data) + "->";
			n = n.next;
		}
		s += "None";
		System.out.println(s);
	}
}