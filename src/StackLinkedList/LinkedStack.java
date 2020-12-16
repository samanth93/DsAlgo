package StackLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// we want to have a class which behaves like a stack
//  so we implement only three class
// instead of using directly, stack will limit the operations
public class LinkedStack {
	private LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee e) {
		stack.push(e);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		Iterator<Employee> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
