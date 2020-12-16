package DoublyLinkedList;

public class EmployeeDoublyLinkedList {
	private EmployeeDoublyNode head;
	private EmployeeDoublyNode tail;
	private int size;
	
	public void addToFront(Employee emp) {
		EmployeeDoublyNode node = new EmployeeDoublyNode(emp);
		node.setNext(head);
		if(head == null) {
			tail = node;
		}else {
			head.setPrevious(node);	
		}
		head = node;
		size++;
	}
	
	public void addToTail(Employee emp) {
		EmployeeDoublyNode node = new EmployeeDoublyNode(emp);
		if(tail==null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
	}
	
	public void addBefore(Employee newEmp, Employee oldEmp) {
		EmployeeDoublyNode newNode = new EmployeeDoublyNode(newEmp);
		EmployeeDoublyNode tempNode = head;
		while(tempNode.getNext().getE().getId() != oldEmp.getId()) {
			tempNode = tempNode.getNext();
		}
		tempNode.getNext().setPrevious(newNode);
		newNode.setNext(tempNode.getNext());
		newNode.setPrevious(tempNode);
		tempNode.setNext(newNode);
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeDoublyNode current = head;
		while(current != null) {
			System.out.println(current.getE());
			current = current.getNext();
		}
	}
	
	public EmployeeDoublyNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeDoublyNode removedNode = head;
		if(head.getNext() == null) {
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;	
	}
	
	public EmployeeDoublyNode removeFromTail() {
		if(isEmpty()) {
			return null;
		}
		EmployeeDoublyNode removedNode = tail;
		if(tail.getPrevious() == null) {
			head = null;
		}else {
			removedNode.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removedNode.setNext(null);
		return head;
	}
}
