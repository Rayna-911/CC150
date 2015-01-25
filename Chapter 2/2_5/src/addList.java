
public class addList {
	public static LinkedListNode addInReverseOrder(LinkedListNode a, LinkedListNode b){
		LinkedListNode dummy = new LinkedListNode(0),tmp=dummy;
		int v, m = 0;
		if (a==null){
			return b;
		}
		if(b == null){
			return a;
		}
		
		while(a!=null && b!=null){
			v = a.data + b.data + m;
			m = v%10;
			tmp.next = new LinkedListNode(v/10);
			tmp = tmp.next;
			a = a.next;
			b = b.next;
		}
		
		while(a!=null){
			v = a.data + m;
			m = v%10;
			tmp.next = new LinkedListNode(v/10);
			tmp = tmp.next;
			a = a.next;
		}
		
		while(b!=null){
			v = b.data + m;
			m = v%10;
			tmp.next = new LinkedListNode(v/10);
			tmp = tmp.next;
			b = b.next;
		}
		
		if(m!=0){
			tmp.next = new LinkedListNode(m);
		}
		
		tmp.next = null;
		return dummy.next;
	}
	
	public static LinkedListNode addInForwardOrder(LinkedListNode a, LinkedListNode b){
		LinkedListNode r = addInReverseOrder(a,b);
		LinkedListNode res = reverse(r);
		return res;
	}
	
	public static LinkedListNode reverse(LinkedListNode n){
		LinkedListNode tmp,p;
		tmp = n.next;
		
		n.next = null;
		
		while(tmp!=null){
			p = tmp.next;
			tmp.next = n;
			n = tmp;
			tmp = p;
		}
		
		return n;
		
	}
}
