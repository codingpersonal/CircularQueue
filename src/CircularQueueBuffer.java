public class CircularQueueBuffer {
	int front = -1;
	int back = -1;
	int queue[];
	int size;
	
	public CircularQueueBuffer(int size) {
		queue = new int[size];
		this.size = size;
	}
	
	//adds an item in the back of the queue
	public boolean addInBack(int item){
		//check if queue is full
		if((back + 1)%size == front) {
			System.out.println("queue full");
			return false;
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
		return true;
	}
	
	//removes an item from front of the queue
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
	
	//So this fn will push count no of elements in the queue.
	//The elements will be conatined in arr[].
	//It will return the actual no of elements pushed.
	//it can be different in case queue becomes full
	public int pushInQueue(int count, int arr[]) {
		int items_added = 0;
		while(count != 0) {
			if(addInBack(1)) {
				items_added++;
			} else {
				System.out.println("queue is full now. cannot add more.");
				break;
			}
			count--;
		}
		return items_added;
	}
	
	//it will pop count no elements from a queue
	//but it will return the actual no of elements popped.
	//it can be different in case queue becomes empty.
	public int popFromQueue(int count) {
		int items_removed = 0;
		while(count != 0) {
			if(removeFront() != -1) {
				items_removed++;
			} else {
				System.out.println("queue is empty, cannot remove more.");
				break;
			}
			count--;
		}
		return items_removed;
	}
	
	public static void main(String[] args) {
		CircularQueueBuffer c = new CircularQueueBuffer(3);
		int arr[] = {1,2,3};
		System.out.println(c.pushInQueue(10, arr));
		System.out.println(c.popFromQueue(1));
		System.out.println(c.popFromQueue(3));		
	}

}
