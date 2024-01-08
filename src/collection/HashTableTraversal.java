package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		
		hashTable.put(1, "One");
		hashTable.put(2, "Two");
		hashTable.put(3, "Three");
		hashTable.put(4, "Four");
		
		// Traversing hashtable values.
		System.out.println("Hash Table values are \n");
		for(Map.Entry<Integer, String> map : hashTable.entrySet()) {			
			
			System.out.println(map.getKey()+" => "+map.getValue());
		}
	}

}
