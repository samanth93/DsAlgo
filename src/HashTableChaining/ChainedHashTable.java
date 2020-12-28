package HashTableChaining;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
	
	private LinkedList<StoredEmployee>[] hashtable;
	
	public ChainedHashTable() {
		hashtable = new LinkedList[10];
		for(int i=0;i<hashtable.length;i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashtable[hashedKey].add(new StoredEmployee(key, employee));
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		while(iterator.hasNext()) {
			if(iterator.next().key.equals(key)) {
				return iterator.next().employee;
			}
		}
//		LinkedList<StoredEmployee> x = hashtable[hashedKey];
//		for(int i=0;i<x.size();i++) {
//			if(x.get(i).key == key) {
//				return x.get(i).employee;
//			}
//		}
		return null;
	}
	
	public Employee remove(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		int index = -1;
		while(iterator.hasNext()) {
			employee = iterator.next();
			index++;
			if(employee.key.equals(key)) {
				break;
			}
		}
		if(employee == null) {
			return null;
		}else {
			hashtable[hashedKey].remove(index);
		}
		return employee.employee;
	}
	
	public void printHashTable() {
		for(int i=0;i<hashtable.length;i++) {
			if(hashtable[i].isEmpty()) {
				System.out.println("There are no elements at position "+i);
			}else {
				System.out.println("Position "+i+": ");
				ListIterator<StoredEmployee> itr = hashtable[i].listIterator();
				while(itr.hasNext()) {
					System.out.print(itr.next().employee);
					System.out.print("->");
				}
				System.out.println("null");
			}
		}
	}
	
//	if you are moding by hashtable length then max will be length
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
}
