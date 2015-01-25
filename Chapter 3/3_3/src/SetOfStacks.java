import java.util.ArrayList;
import java.util.Stack;


public class SetOfStacks<E> {
	private int threshold;
	ArrayList<Stack<E>> s;
	
	public SetOfStacks(int threshold){
		this.threshold = threshold;
		s = new ArrayList<Stack<E>>();
	}
	
	public void push(E data){
		Stack<E> last = getLastStack();
		if(isFull(last) || last == null){
			Stack<E> sub = new Stack<E>();
			sub.add(data);
			s.add(sub);
		}
		else{
			last.add(data);
		}
	}
	
	public E pop(){
		Stack<E> last = getLastStack();
		if(last == null){
			return null;
		}
		E item = last.pop();
		if(isEmpty(last)){
			s.remove(s.size()-1);
		}
		return item;
	}
	
	public E popAt(int index){
		int num = index/threshold;
		Stack<E> happenInS = s.get(num);
		int t = num%threshold;
		E item = happenInS.elementAt(t);
		happenInS.remove(t);
		
		while(num<s.size()-1){
			Stack<E> next = s.get(num+1);
			happenInS.add(next.elementAt(0));
			next.remove(0);
			happenInS = next;
			num++;
		}
		
		Stack<E> last = getLastStack();
		if(last.size() == 0){
			s.remove(s.size()-1);
		}
		
		return item;
	}
	
	public Stack<E> getLastStack(){
		if(s.size()==0){
			return null;
		}
		return s.get(s.size()-1);
	}
	
	public boolean isFull(Stack<E> stack){
		return stack.size() == threshold;
	}
	
	public boolean isEmpty(Stack<E> stack){
		return stack.size()==0;
	}
	
}
