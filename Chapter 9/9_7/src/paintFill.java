import java.util.LinkedList;
import java.util.Queue;

//import java.awt.Color;


public class paintFill {
	enum Color{ Red, Green, Black, White};
	//dfs
	public static boolean paint1(Color[][] screen, int x, int y, Color ncolor){
		if(screen[y][x] == ncolor){ // pay attention to the order of x and y!!! x: left->right so x=>column
			return false; 
		}
		return helperdfs(screen, x, y, screen[y][x], ncolor);
	}
	
	private static boolean helperdfs(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
		if(x<0||x>screen[0].length||y<0||y>screen.length){
			return false;
		}
		if(screen[y][x] == ocolor){
			screen[y][x] = ncolor;
			helperdfs(screen,x+1,y,ocolor,ncolor);
			helperdfs(screen,x-1,y,ocolor,ncolor);
			helperdfs(screen,x,y+1,ocolor,ncolor);
			helperdfs(screen,x,y-1,ocolor,ncolor);
		}
		return true;
	}
	
	//bfs
	public static boolean paint2(Color[][] screen, int x, int y, Color ncolor){
		if(screen[y][x] == ncolor){ // pay attention to the order of x and y!!! x: left->right so x=>column
			return false; 
		}
		return helperbfs(screen,x,y,screen[y][x],ncolor);
	}
	
	private static boolean helperbfs(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
		if(x<0||x>screen[0].length||y<0||y>screen.length){
			return false;
		}
		
		Queue<Point> q = new LinkedList<Point>();
		q.offer(new Point(x,y));
		while(!q.isEmpty()){
			Point tmp = q.poll();
			if(screen[tmp.y][tmp.x] == ocolor){
				screen[tmp.y][tmp.x] = ncolor;
				if(check(screen, tmp.x+1,tmp.y)) q.offer(new Point(tmp.x+1,tmp.y));
				if(check(screen, tmp.x-1,tmp.y)) q.offer(new Point(tmp.x-1,tmp.y));
				if(check(screen, tmp.x,tmp.y+1)) q.offer(new Point(tmp.x,tmp.y+1));
				if(check(screen, tmp.x,tmp.y-1)) q.offer(new Point(tmp.x,tmp.y-1));
			}
		}
		return true;
	}
	private static boolean check(Color[][] screen, int x, int y){
		if(x<0||x>screen[0].length||y<0||y>screen.length){
			return false;
		}
		else{
			return true;
		}
	}
}
