
public class listCycle {
	public static LinkedListNode findBeginning(LinkedListNode n){
		LinkedListNode slow = n, fast = n;
		
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast){
				break;
			}
		}
		
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = n;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
