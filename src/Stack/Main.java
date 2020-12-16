package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(10);
		stack.push(new Employee("jane1","jones1", 231));
		stack.push(new Employee("jane2","jones2", 232));
		stack.push(new Employee("jane3","jones3", 233));
		stack.push(new Employee("jane4","jones4", 234));
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
}
