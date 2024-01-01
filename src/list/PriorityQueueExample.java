package list;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(10);
		priorityQueue.add(20);
		priorityQueue.add(30);
		
		System.out.println("Elements of priority queue are : \n");
		System.out.println(priorityQueue);
		System.out.println("================================================================");
		
		// insert an element into priority queue.
		System.out.println("Element inserted using offer method \n");
		priorityQueue.offer(40);
		System.out.println(priorityQueue);
		
		System.out.println("================================================================");
		
		boolean doesQueueContainsElement = priorityQueue.contains(20);
		System.out.println("\nDoes Priority Queue Contains Element 20 : "+doesQueueContainsElement);
		
		System.out.println("================================================================");
		
		System.out.println("Top element retrived from queue.");
		// removes top element from queue. To retrive and remove, use poll() method.
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
	}

}
