package CircularQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		ArrayQueue employeeList = new ArrayQueue(10);
		employeeList.add(new Employee("Sam", "Sid", 1));
		employeeList.add(new Employee("Vis", "Sid", 2));
		employeeList.add(new Employee("Jay", "Sid", 3));
		employeeList.printQueue();
	}

}
