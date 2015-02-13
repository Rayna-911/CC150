import java.util.LinkedList;
import java.util.Queue;


public class ExistRoute {
	public enum State{
		visited, unvisited,visiting
	}
	public static boolean search(Graph g, Node start, Node end){
		if(start == end) return true;
		
		Queue<Node> q = new LinkedList<Node>();
		
		for(Node n : g.getNode()){
			n.state = State.unvisited;
		}
		
		start.state = State.visiting;
		q.add(start);
		
		while(!q.isEmpty()){
			Node x = q.poll();
			if(x!=null){
				if(x.state == State.unvisited){
					if(x==end) return true;
					else{
						x.state = State.visiting;
						q.add(x);
					}
				}
			x.state = State.visited;
			}
		}
		return false;
	}
}
