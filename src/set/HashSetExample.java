package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		HashSet<Integer> hashSet = new HashSet<Integer>();	
		
		if(hashSet.isEmpty()) {
			System.out.println("Hashset has no any element added yet.");
		}
		
		System.out.println("==================================================");
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);		
		
		System.out.println("Display elements in hash set\n");
		// here elements may not be displayed in the same order in which they have added.
		System.out.println(hashSet);
		System.out.println("\n Size of hash set is : "+hashSet.size());
		System.out.println("==================================================");
		
		// remove all the elements from hash set
		System.out.println("All elements are removed using clear() method.");
		hashSet.clear();
		System.out.println(hashSet);
		System.out.println("\nSize of hash set after removing all elements using clear() : "+hashSet.size());
		
		System.out.println("==================================================");
		
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(100);
		listInteger.add(101);
		listInteger.add(102);
		listInteger.add(103);
		
		// Using addAll method to add collection to hash set
		System.out.println("Adding collection to hash set\n");
		hashSet.addAll(listInteger);
		System.out.println(hashSet);
		
		System.out.println("==================================================");
		
		// remove() is used to remove object from hash set
		hashSet.remove(listInteger.get(2));
		System.out.println("Integer object at index 2 is removed\n");
		System.out.println(hashSet);
	}

}
