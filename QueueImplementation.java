
public class QueueImplementation {
	
	private int capacity, count, front, rear;
	private int[] arr;
	public QueueImplementation(int size) {
		// TODO Auto-generated constructor stub
		arr=new int[size];
		capacity = size;
		count=0;
		rear=-1;
		front=0;
	}
	int size() {
		return count;
	}
	boolean isEmpty() {
		return (size()==0);
	}
	boolean isFull() {
		return (size()==capacity);
	}
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full Cannot insert further");
			System.exit(0);
		}
		System.out.println("Inserting element:"+value);
		rear = (rear+1)%capacity;
		arr[rear] = value;
		count++;
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Stack is empty. Cannot Dequeue.");
			System.exit(0);
		}
		System.out.println("Removing element: "+arr[front]);
		front = (front+1)%capacity;
		count--;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("No elements to peek");
			System.exit(0);
		}
		return (arr[front]);
	}
	
	public void listAll() {
		int j = size()-1;
		while(j>=0) {
			System.out.println("Element at position: "+j+" has value: "+arr[j]);
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueImplementation checkQueue = new QueueImplementation(5);
		checkQueue.enqueue(1);
		checkQueue.enqueue(2);
		checkQueue.enqueue(3);
		checkQueue.enqueue(4);
		checkQueue.enqueue(5);
		
		checkQueue.listAll();
		
	}

}
