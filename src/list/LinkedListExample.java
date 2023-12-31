package list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		for(int i=0;i<10;i++) {
			linkedList.add(i);
		}
		
		System.out.println("Elements of linked list are :\n");
		System.out.println(linkedList);
		
		System.out.println("\n");
		
		linkedList.remove(5);
		
		System.out.println("Elements of linked list after removing one element are :\n");
		System.out.println(linkedList);
		
		System.out.println("\n");
		
		for(int i=0;i<linkedList.size();i++) {
			System.out.println("Element at index "+i+" is "+linkedList.get(i));
		}
	}

}
