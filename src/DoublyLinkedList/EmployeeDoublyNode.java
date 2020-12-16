package DoublyLinkedList;

public class EmployeeDoublyNode {
	private Employee e;
//	we dont have to set the next to null as it is default
	private EmployeeDoublyNode next;
	private EmployeeDoublyNode previous;
	
	public EmployeeDoublyNode(Employee e) {
		this.e = e;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	public EmployeeDoublyNode getNext() {
		return next;
	}

	public EmployeeDoublyNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeDoublyNode previous) {
		this.previous = previous;
	}

	public void setNext(EmployeeDoublyNode next) {
		this.next = next;
	}
}
