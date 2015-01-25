public class LinkedListNode{
		int data;
		LinkedListNode next;
		
		public LinkedListNode(int n){
			this.data = n;
			this.next = null;
		}
		public void print(){
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

