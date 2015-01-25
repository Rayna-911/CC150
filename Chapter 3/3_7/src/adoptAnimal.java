import java.util.LinkedList;


public class adoptAnimal {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0 ;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog){
			dogs.addLast((Dog) a);
		}
		else if(a instanceof Cat){
			cats.addLast((Cat) a);
		}
	}
	
	public Animal dequeueAny(){
		if(dogs.isEmpty()){
			return dequeueCat();
		}
		else if(cats.isEmpty()){
			return dequeueDog();
		}
		else{
			Dog d = dogs.peek();
			Cat c = cats.peek();
			if(d.getOrder()<c.getOrder()){
				return dequeueDog();
			}
			else{
				return dequeueCat();
			}
		}
	}
	
	public Dog dequeueDog(){
		return dogs.poll();
	}
	
	public Cat dequeueCat(){
		return cats.poll();
	}
}

