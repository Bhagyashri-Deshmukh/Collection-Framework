package set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("America");
		treeSet.add("Canada");
		treeSet.add("Africa");
		treeSet.add("Romania");
		
		System.out.println("First element of tree set is \n");
		System.out.println(treeSet.first());
		System.out.println("==========================================");
		System.out.println("Last element of tree set is \n");
		System.out.println(treeSet.last());
		
		System.out.println("==========================================");
		System.out.println("Size of tree set is \n");
		System.out.println(treeSet.size());
		
		System.out.println("==========================================");
		System.out.println("Tree set is \n");
		System.out.println(treeSet);
		
		System.out.println("==========================================");
		System.out.println("Higher value than entered value \n");
		System.out.println(treeSet.higher("Canada"));
		
		System.out.println("==========================================");
		System.out.println("Lower value than entered value \n");
		System.out.println(treeSet.lower("Canada"));
		
		System.out.println("==========================================");
		System.out.println("Removing first element from a set \n");
		System.out.println(treeSet.pollFirst());
		
		System.out.println("==========================================");
		System.out.println("Removing last element from a set \n");
		System.out.println(treeSet.pollLast());
	}

}
