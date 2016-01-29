//MOCK INTERVIEW QUESTION
public class Dequeue {
	int queue[];
	int front = -1;
	int back = -1;
	int size = 0;
	
	public Dequeue(int size) {
		this.size = size;
		queue = new int[size];
	}
	
	public void addInFront(int item){
		//check if queue is full
		if((back + 1)%size == front) {
			System.out.println("queue full");
			return;
		}
		
		//first element in the queue
		if(front == -1 && back == -1) {
			front++;
			back++;
			queue[front] = item;
		} else {
			front = (front - 1 + size) %size;
			queue[front] = item;
		}
	}
	
	public void addInBack(int item){
		//check if queue is full
		if((back + 1)%size == front) {
			System.out.println("queue full");
			return;
		}
		
		//first element in the queue
		if(front == -1 && back == -1) {
			front++;
			back++;
			queue[front] = item;
		} else {
			back = (back + 1) % size;
			queue[back] = item;
		}
	}
	
	public int removeFront() {
		if(front == -1 && back == -1) {
			System.out.println("queue empty");
			return -1;
		}
		int item = queue[front];
		if(front == back) {
			front = -1;
			back = -1;
		} else {
			front = (front + 1) % size;
		}
		return item;
	}
	
	public int removeBack() {
		if(front == -1 && back == -1) {
			System.out.println("queue empty");
			return -1;
		}
		int item = queue[back];

		//remove the last element
		if(front == back) {
			front = -1;
			back = -1;
		}
		else
			back = (back - 1 + size) %size;
		return item;
	}
	
	public void display() {
		if(front == -1 && back == -1){
			System.out.println("queue empty");
			return;
		}
		while(front != back) {
			System.out.println(queue[front]);
			front = (front + 1) % size;
		}
		System.out.println(queue[front]);
		
	}
	
	public static void main(String args[]) {
		Dequeue q = new Dequeue(10);
		q.addInBack(1);
		q.addInBack(2);
		q.addInBack(3);
		q.addInBack(4);
		q.addInBack(5);
		q.addInBack(6);
		q.addInFront(7);
		q.addInFront(8);
		q.addInFront(9);
		q.addInBack(10);
		q.removeBack();
		q.removeBack();
		q.removeFront();
		q.removeFront();
		q.removeFront();
		q.removeFront();
		q.removeFront();
		q.removeFront();
		q.removeBack();
		
		q.removeFront();
		System.out.println(q.front+" " + q.back);
		q.display();
	}
}
