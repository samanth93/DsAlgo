package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Why using List on LHS and ArrayList on RHS
//		Because if we decide to go with something else than arraylist in future
//		we just have to change RHS
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Sam", "Sid", 1));
		employeeList.add(new Employee("Vis", "Sid", 2));
		employeeList.add(new Employee("Jay", "Sid", 3));
		employeeList.forEach(employee -> System.out.println(employee));
		System.out.println(employeeList.get(2));
		System.out.println(employeeList.size());
		
	}

}
