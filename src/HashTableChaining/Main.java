package HashTableChaining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
		System.out.println(hashMap.containsKey("Doe"));
		System.out.println(hashMap.containsValue(johnDoe));
//		Iterator<Employee> iterator = hashMap.values().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		hashMap.putIfAbsent("Doe", mikeWilson);
		hashMap.forEach((k, v)->System.out.println("Key = "+k+", Employee = "+v));
	}
}
