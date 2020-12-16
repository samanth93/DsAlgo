package LinkedListJdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Employee x=new Employee("Sam", "Sid", 1);
		Employee y=new Employee("Vis", "Sid", 2);
		Employee z=new Employee("Jay", "Sid", 3);
		Employee a=new Employee("Bill", "End", 5);
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.addFirst(x);
		list.addFirst(y);
		list.addFirst(z);
//		it adds at the end of list
		list.add(a);
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
