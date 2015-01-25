
public class partition {
	public static LinkedListNode partition(LinkedListNode n, int x){
		LinkedListNode dummyless,dummylarger,tmpless,tmplarger,p;
		
		dummyless = new LinkedListNode(0);
		dummyless.next = n;
		tmpless = dummyless;
		
		dummylarger = new LinkedListNode(0);
		dummylarger.next = n;
		tmplarger = dummylarger;
		
		while(n!=null){
			if(n.data<x){
				tmpless.next = n;
				tmpless = tmpless.next;
				n = n.next;
				tmpless.next = null;
			}
			else{
				tmplarger.next = n;
				tmplarger = tmplarger.next;
				n = n.next;
				tmplarger.next = null;
				}
		}
		
		tmpless.next = tmplarger.next;
			
		return dummyless.next;
	}
}
