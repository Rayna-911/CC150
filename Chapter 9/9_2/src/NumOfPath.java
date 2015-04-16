import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;


public class NumOfPath {
	// Q1: Robot should move x+y steps, where right x, down y. So, there are [(x+y) choose x] ways, which is [(x+y)!]/[(x!)(y!)].  
	public static  boolean findPath(int x, int y, ArrayList<Point> path, Hashtable<Point,Boolean> cache){
		if(x<0||y<0||!isFree(x,y)){
			return false;
		}
		Point p = new Point(x,y);
		if(cache.contains(p)){
			return cache.get(p);
		}
		boolean isOriginal = (x==0&&y==0);
		boolean succ = false;
		if(isOriginal || findPath(x,y-1,path,cache) || findPath(x-1,y,path,cache)){
			path.add(p);
			succ = true;
		}
		cache.put(p,succ);
		return succ;
	}
	
	private static boolean isFree(int x, int y){
		// check if(x,y) is block
	}
}
