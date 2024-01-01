package list;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		
		arrayDeque.add(10);
		arrayDeque.add(20);
		arrayDeque.add(30);
		arrayDeque.add(40);
		
		System.out.println("Elements of array are :\n");
		System.out.println(arrayDeque);
		System.out.println("========================================================");
		
		// Adding element at the starting of array deque
		arrayDeque.addFirst(5);
		
		// Adding element at the starting of array deque
		arrayDeque.addLast(50);
		
		// print array deque after adding element at the starting and at the end of array deque.
		System.out.println(arrayDeque);
		
		System.out.println("========================================================");
		// clear() method will remove all the elements from the array deque.
		arrayDeque.clear();
		System.out.println("Array dequeue after clear method : \n");
		System.out.println(arrayDeque);
	}

}
