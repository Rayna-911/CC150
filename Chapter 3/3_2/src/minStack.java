import java.util.Stack;


public class minStack {
	Stack<Integer> s;
	Stack<Integer> st;
	
	public minStack(){
		s = new Stack<Integer>();
		st = new Stack<Integer>();
	}
	
	public int pop(){
		if(s.isEmpty()){
			return Integer.MAX_VALUE;
		}
		int item = s.pop();
		if (item==st.peek()){
			st.pop();
		}
		return item;		
	}
	
	public void push(int data){
		s.push(data);
		if(st.isEmpty() || data<st.peek()){
			st.push(data);
		}
	}
	
	public int min(){
		if(st.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return st.peek();
	}
}
