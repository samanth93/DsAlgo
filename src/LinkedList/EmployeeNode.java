package LinkedList;

public class EmployeeNode {
	private Employee e;
//	we dont have to set the next to null as it is default
	private EmployeeNode next;
	
	public EmployeeNode(Employee e) {
		this.e = e;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
}
