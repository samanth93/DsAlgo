package Queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
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
	
	public void remove() {
		if(size()==0) {
			throw new NoSuchElementException();
		}
		Employee temp = queue[front];
		queue[front]=null;
		front++;
		if(size()==0) {
			front=0;
			back=0;
		}
	}
	
	public Employee peek() {
		if(size()==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public int size() {
		return back-front;
	}
	
	public void printQueue() {
		for(int i=front;i<back;i++) {
			System.out.println(queue[i]);
		}
	}
}
