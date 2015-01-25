import java.util.Stack;


public class Hanoi {
	private Stack<Integer> disk;
	private int index;
	
	public Hanoi(int num){
		disk = new Stack<Integer>();
		this.index = num;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public void add(int d){
		if(!disk.isEmpty() && disk.peek()<d){
			System.out.println("Error");
		}
		disk.push(d);
	}
	
	public void MoveTopTo(Hanoi h){
		int tmp = disk.pop();
		h.add(tmp);
	}
	
	public void MoveDisks(int n, Hanoi destination, Hanoi buffer){
		if(n>0){
			MoveDisks(n-1,buffer,destination);
			MoveTopTo(destination);
			MoveDisks(n-1,destination,this);
		}
	}
	
	public void MoveBetweenThreeTowers(int disks){
		Hanoi[] towers = new Hanoi[3];
		for(int i = 0; i<3;i++){
			towers[i] = new Hanoi(i);
		}
		
		for(int i = 2; i>-1;i--){
			towers[0].add(i);
		}
		towers[0].MoveDisks(disks, towers[2], towers[1]);
	}
}
