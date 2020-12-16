package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Employee x=new Employee("Sam", "Sid", 1);
		Employee y=new Employee("Vis", "Sid", 2);
		Employee z=new Employee("Jay", "Sid", 3);
		EmployeeLinkedList l = new EmployeeLinkedList();
		l.addToFront(x);
		l.addToFront(y);
		l.addToFront(z);
		l.printList();
		System.out.println(l.getSize());
		l.removeFromFront();
		System.out.println(l.getSize());
		l.printList();
	}

}
