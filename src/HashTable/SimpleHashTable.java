package HashTable;

public class SimpleHashTable {
	private StoredEmployee[] hashtable;
	
	public SimpleHashTable() {
		hashtable = new StoredEmployee[10];
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if(occupied(hashedKey)) {
//			if it is occupied we need to do linear probing
//			we loop around till we find empty spot or stop index
			int stopIndex = hashedKey;
			if(hashedKey == hashtable.length-1) {
				hashedKey = 0;
			}else {
				hashedKey++;
			}
//			the above if else will help to set the first probe value
			while(occupied(hashedKey) && hashedKey!=stopIndex) {
//				we are moding it to prevent IndexOut of Bound when hashedKey = 9
				hashedKey = (hashedKey+1) % hashtable.length;
			}
		}
//		After completing the full loop in the if condition above 
		if(occupied(hashedKey)) {
			System.out.println("Sorry, there's already an employee at position "+ hashedKey);
		}else {
			hashtable[hashedKey] = new StoredEmployee(key, employee);
		}
	}
	
	public Employee get(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		return hashtable[hashedKey].employee;
	}
	
//	if you are moding by hashtable length then max will be length
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
			return hashedKey;
		} else {
//			same code as linear probing should be used
			int stopIndex = hashedKey;
			if (hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			}else {
				hashedKey++;
			}
			while (hashedKey != stopIndex && 
					hashtable[hashedKey]!=null && 
					!hashtable[hashedKey].key.equals(key)) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
			if(stopIndex == hashedKey) {
				return -1;
			}else {
				return hashedKey;
			}
		}
	}
	
	private boolean occupied(int index) {
		return hashtable[index] != null;
	}
	
	public void printHashtable() {
		for(int i=0;i<hashtable.length;i++) {
			if(hashtable[i]==null) {
				System.out.println("empty");
			}else {
				System.out.println("Position "+i+": "+hashtable[i].employee);
			}			
		}
	}
}
