import java.util.Stack;


public class sortStack {

	public Stack<Integer> sort1(Stack<Integer> stack){
		Stack<Integer> help = new Stack<Integer>();
		
		while(!stack.isEmpty()){
			int tmp = stack.pop();
			if(!help.isEmpty() && help.peek()>tmp){
				while (help.peek()>tmp){
					stack.push(help.pop());
				}
			}
			help.push(tmp);
		}
		return help;
	}
	// with only one extra stack, O(n^2) time, O(n) space
}
