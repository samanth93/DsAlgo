package DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Employee x=new Employee("Sam", "Sid", 1);
		Employee y=new Employee("Vis", "Sid", 2);
		Employee z=new Employee("Jay", "Sid", 3);
		EmployeeDoublyLinkedList l = new EmployeeDoublyLinkedList();
		l.addToFront(x);
		l.addToFront(y);
		l.addToFront(z);
//		l.printList();
//		l.removeFromFront();
//		l.removeFromTail();
		System.out.println(l.getSize());
		System.out.println(l.getSize());
		l.addBefore(new Employee("Jay4", "Sid4", 4), y);
		l.printList();
	}

}
