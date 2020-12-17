package Queue;

public class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int back;
	
	public void ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee e) {
		if(back == queue.length) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, back);
			queue = newArray;
		}
		queue[back]=e;
		back++;
	}
	public int size() {
		return back-front;
	}
}
