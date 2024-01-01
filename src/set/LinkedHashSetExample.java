package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Pune");
		linkedHashSet.add("Mumbai");
		linkedHashSet.add("Nashik");
		linkedHashSet.add("Nanded");
		linkedHashSet.add("Nagpur");

    // Traversing elements using iterator
    Iterator<String> itr = linkedHashSet.iterator();
	    while (itr.hasNext()) {
	        System.out.println(itr.next());
	    }
	}

}
