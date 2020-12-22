package HashTableDemo;


public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		StoredEmployee jane = new StoredEmployee("Jones", janeJones);
		
		Employee johnDoe = new Employee("John", "Doe", 4567);
		StoredEmployee john = new StoredEmployee("Doe", johnDoe);
		
		Employee marySmith = new Employee("Mary", "Smith", 22);
		StoredEmployee mary = new StoredEmployee("Smith", marySmith);
		
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		StoredEmployee mike = new StoredEmployee("Wilson", mikeWilson);
		
		Employee billEnd = new Employee("Bill", "End", 78);
		StoredEmployee bill = new StoredEmployee("End", billEnd);
		
		EmployeeHashTable x = new EmployeeHashTable(10);
		
		x.put(jane);
		x.put(john);
		x.put(mary);
		x.put(mike);
		x.put(bill);		
		x.printHashTable();
	}

}
