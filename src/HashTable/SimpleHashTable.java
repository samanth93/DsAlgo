package HashTable;

public class SimpleHashTable {
	private Employee[] hashTable;
	
	public SimpleHashTable(int capacity) {
		hashTable = new Employee[capacity];
	}
	
//	This is not a wonderful hash function, but just made up for course
//  A hash function is said good if the keys are evenly distributed
//	So that the retrival will be faster
	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}
	
//	This is an basic implementation. so we are not looking at collisions
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if(occupied(hashedKey)) {
			int stopIndex = hashedKey;
			if(hashedKey == hashTable.length - 1) {
				hashedKey =0;
			}else {
				hashedKey++;
			}
			while(occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey+1)%hashTable.length;
			}
		}
		if(hashTable[hashedKey] !=null) {
			System.out.println("Sorry, there is already an employee"+hashedKey);
		}else {
			hashTable[hashedKey] = employee;
		}
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		return hashTable[hashedKey];
	}
	
	private boolean occupied(int index) {
		return hashTable[index] !=null;
	}
	
	public void printHashTable() {
		for(int i=0;i<hashTable.length;i++) {
			System.out.println(hashTable[i]);
		}
	}
}
