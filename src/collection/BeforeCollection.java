package collection;

import java.util.Hashtable;
import java.util.Vector;

public class BeforeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{1,2,3,4};
		
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(101, "Bhagyashri");
		hashTable.put(102, "Neha");
		
		System.out.println("Array element is : "+array[0]);
		System.out.println("Array element is : "+array[1]);
		System.out.println("Array element is : "+array[2]);
		System.out.println("Array element is : "+array[3]);
		System.out.println("===========================================================");
		System.out.println("Vector element is : "+vector.elementAt(0));
		System.out.println("Vector element is : "+vector.elementAt(1));
		System.out.println("===========================================================");
		System.out.println("Hash Table element is : "+hashTable.get(101));
		System.out.println("Hash Table element is : "+hashTable.get(102));
	}

}
