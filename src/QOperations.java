
public class QOperations {
	int beg = -1;
	int end = -1;
	int queue[];
	int size;

	public QOperations(int size) {
		queue = new int[size];
		this.size = size;
	}

	public void insertItem(int item) {
		
		//Inserting first element in the queue
		if(beg == -1) {
			System.out.println("This is the first element in the queue :" + item);
			queue[beg + 1] = item;
			beg = beg + 1;
			end = beg;
			return;
		}
		
		//checking if queue is full
		if(((end + 1) % size) == beg) {
			System.out.println("Queue is full. Cannot insert more elements");
		}
		else {
			System.out.println("Inserting element: " + item);
			end = (end + 1) %size;
			queue[end] = item;
		}
	}
	
	public int removeItem() {
		int item = -1;
		
		//removing from an empty queue
		if(beg == -1) {
			System.out.println("Queue is empty. Cannot pop anything.");
		}
		
		//removing the last element from the queue
		else if(beg == end) {
			System.out.println("Removing the only element from the Q");
			item = queue[beg];
			beg = -1;
			end = -1;			
		}
		
		//valid case for removing the element
		else {
			item = queue[beg];
			beg = (beg + 1) %size;
		}
		
		return item;
	}
	
	public void displayQ() {
		int beg_ = beg;
		int end_ = end;
		
		System.out.println("Displaying the elements of the Q:");
		if(beg_ == end_ && beg_ != -1) {
			System.out.println("The only element of the Q : "+queue[beg_]);
			return;
		}
		
		while(beg_ != end_) {
			System.out.println(queue[beg_]);
			beg_ = (beg_ + 1) % size;
			if(beg_ == end_) {
				System.out.println(queue[beg_]);
			}
		}
	}
}
