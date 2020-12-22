package HashTableDemo;

public class StoredEmployee {
	private String key;
	private Employee employee;
	public StoredEmployee(String key, Employee employee) {
		this.key = key;
		this.employee = employee;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
