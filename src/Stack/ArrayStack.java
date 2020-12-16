package Stack;

import java.util.EmptyStackException;

public class ArrayStack {
	private Employee[] stack;
//	when top is 0 stack is empty, by default it is 0
//	important top will always point to the next available index
	private int top;
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	public void push(Employee employee) {
		if(top == stack.length) {
			// need to resize the backing array
			Employee[] newArray = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
//		we assign to top and increment the top after insertion
		stack[top++] = employee;
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee toBeRemoved = stack[--top];
		stack[top] = null;
		return toBeRemoved; 
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top -1]; 
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void printStack() {
		for(int i=top-1;i>=0;i++) {
			System.out.println("\t"+stack[i]);
		}
	}
}
