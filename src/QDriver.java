
public class QDriver {

	public static void main(String[] args) {
		QOperations q = new QOperations(4);
		int item;
		
		item = q.removeItem();
		System.out.println("Item popped is:"+item);
		q.displayQ();
		System.out.println("\n");
		
		q.insertItem(11);
		q.displayQ();
		System.out.println("\n");
		
		q.insertItem(12);
		q.displayQ();
		System.out.println("\n");
		
		q.insertItem(13);
		q.displayQ();
		System.out.println("\n");
		
		q.insertItem(14);
		q.displayQ();
		System.out.println("\n");
		
		q.insertItem(14);
		q.displayQ();
		System.out.println("\n");
		
		System.out.println("Removing one element.");
		q.removeItem();
		q.displayQ();
		System.out.println("\n");

		System.out.println("Removing one element.");
		q.removeItem();
		q.displayQ();
		System.out.println("\n");
		
		System.out.println("Removing one element.");
		q.removeItem();
		q.displayQ();
		System.out.println("\n");
		
		System.out.println("Removing one element.");
		q.removeItem();
		q.displayQ();
		System.out.println("\n");
		
		System.out.println("Removing one element.");
		q.removeItem();
		q.displayQ();
		System.out.println("\n");
		
	}

}
