import java.util.Stack;


public class myQueue<E> {
	private Stack<E> forward;
	private Stack<E> reverse;
	
	public myQueue(){
		forward = new Stack<E>();
		reverse = new Stack<E>();		
	}
	
	public void enqueue(E data){
		forward.push(data);
	}
	
	public int size(){
		return forward.size()+reverse.size();
	}
	
	public E dequeue(){
		shift();
		if(reverse.isEmpty()){
			return null;
		}
		return reverse.pop();
	}
	
	public E peak(){
		shift();
		if(reverse.isEmpty()){
			return null;
		}
		return reverse.peek();
	}
	
	private void shift(){
		if(reverse.isEmpty()){
			while(!forward.isEmpty()){
				reverse.push(forward.pop());
			}
		}
	}
	
}
