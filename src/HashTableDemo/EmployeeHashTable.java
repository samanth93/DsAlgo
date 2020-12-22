package HashTableDemo;

public class EmployeeHashTable {
	
	private StoredEmployee[] empHashTable;
	
	public EmployeeHashTable(int capacity) {
		empHashTable = new StoredEmployee[capacity];
	}
	
	public int getHashedKey(String key) {		
		return key.length() % empHashTable.length;
	}
	
	public void put(StoredEmployee emp) {
		int hashCode = getHashedKey(emp.getKey());
		if(!isOccupied(hashCode)) {
			System.out.println("Added "+emp.getEmployee()+" hash code: "+hashCode);
			empHashTable[hashCode] = emp;
		}else {
			System.out.println("Cannot Add "+emp.getEmployee() +" hash code: "+hashCode);
		}		
	}
	
	public StoredEmployee get(String key) {
		StoredEmployee emp = empHashTable[getHashedKey(key)];
		return emp;
	}
	
	public void printHashTable() {
		for(int i=0;i<empHashTable.length;i++) {
			if(empHashTable[i]!=null) {
				System.out.println(empHashTable[i].getEmployee());
			}			
		}
	}
	
	public boolean isOccupied(int index) {
		return empHashTable[index] != null;
	}
}
