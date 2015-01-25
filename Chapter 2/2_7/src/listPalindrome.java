import java.util.Stack;


public class listPalindrome {
	public static boolean check(LinkedListNode n){
		LinkedListNode slow = n, fast = n;
		int tmp;
		Stack<Integer> s = new Stack<Integer>();
		
		while(fast!=null && fast.next!=null){
			s.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null){
			slow = slow.next;
		}
		
		while(slow != null){
			tmp = s.pop().intValue();
			if(tmp != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}
