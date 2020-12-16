package Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
//		Why using List on LHS and ArrayList on RHS
//		Because if we decide to go with something else than arraylist in future
//		we just have to change RHS
		List<Employee> employeeList = new Vector<Employee>();
		employeeList.add(new Employee("Sam", "Sid", 1));
		employeeList.add(new Employee("Vis", "Sid", 2));
		employeeList.add(new Employee("Jay", "Sid", 3));
		employeeList.set(0, new Employee("Sam", "Sidha", 1));
		employeeList.forEach(employee -> System.out.println(employee));
		System.out.println();
		System.out.println(employeeList.get(2));
		System.out.println(employeeList.size());
//		converting employeeList to array
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee emp: employeeArray) {
			System.out.println(emp);
		}
//		for contains to work you should add equals hashCode method in Employee class
//		because now it actually looks into the data as well
		System.out.println(employeeList.contains(new Employee("Sam", "Sidha", 1)));
		System.out.println(employeeList.indexOf(new Employee("Sam", "Sidha", 1)));
//		The contains and indexOf are like search algorithms
		employeeList.remove(0);
		employeeList.forEach(employee -> System.out.println(employee));
	}

}
