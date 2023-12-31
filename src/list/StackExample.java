package list;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		stack.push("Bhagyashri");
		stack.push("Priyanka");
		stack.push("Sameer");
		
		System.out.println("Element of stack are \n");
		System.out.println(stack);
		
		stack.remove(1);
		
		System.out.println("\nElement of stack after removing one are \n");
		System.out.println(stack);
		System.out.println("\n Elements after pop operation");
		stack.pop();
		System.out.println(stack);
		
		System.out.println("=======================================================================");
		
		stack.push("Pratik");
		stack.push("Pradnya");
		stack.push("Murti");
		System.out.println(stack);
		
		System.out.println("=======================================================================");
		
		System.out.println("Iterating over a stack\n");
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element is : "+iterator.next());
		}
	}

}
