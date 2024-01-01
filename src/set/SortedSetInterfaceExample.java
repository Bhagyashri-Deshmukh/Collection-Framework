package set;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedSetInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		 
		treeSet.add("Maharashtra");
		treeSet.add("Gujrat");
		treeSet.add("TamilNadu");
 
        // Traversing elements using iterator.
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
