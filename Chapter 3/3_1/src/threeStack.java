
public class threeStack<E> {
	private int size;
	private E[] arr;
	private int[] pointer = {0,0,0};
	
	public threeStack(int capacity){
		this.arr = (E[])new Object[capacity*3];
		this.size = capacity;	
	}
	
	public void push(E data, int num){
		if(isFull(num-1)){
			System.out.println("Stack "+num+" is full.");
		}
		arr[size*(num-1)+pointer[num-1]] = data;		
		pointer[num-1]++;
	}
	
	public E pop(int num){
		if(isEmpty(num)){
			System.out.println("Stack "+num+" is empty.");
		}
		E item = arr[size*(num-1)+pointer[num-1]];
		arr[size*(num-1)+pointer[num-1]] = null;
		pointer[num-1]--;
		return item;
	}
	
	public E peak(int num){
		if(isEmpty(num)){
			System.out.println("Stack "+num+" is empty.");
		}
		return arr[size*(num-1)+pointer[num-1]];
	}
	
	public boolean isFull(int num){
		if(pointer[num-1] == size){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isEmpty(int num){
		return pointer[num-1]==0;
	}
	
}
