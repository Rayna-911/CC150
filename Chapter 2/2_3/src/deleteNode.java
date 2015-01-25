
public class deleteNode {
	public static boolean delete(LinkedListNode n){
		if(n==null || n.next == null){
			return false;
		}
		
		LinkedListNode newNode = n.next;
		n.data = newNode.data;
		n.next = newNode.next;
		return true;
	}
}
