package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> hashTable = new Hashtable<>();
		
		hashTable.put("abcd", "ABCD");
		hashTable.put("pqrs", "ABCD");
		hashTable.put("mnop", "MNOP");
		hashTable.put("wxyz", "WXYZ");
		
		System.out.println("Printing hash table \n");
		System.out.println(hashTable);
		
		System.out.println("====================================================");
		hashTable.remove("abcd");
		System.out.println("Printing hash table after removing abcd \n");
		System.out.println(hashTable);
		
		System.out.println("====================ENUMERATION=====================\n");
		
		Enumeration<String> enumeration = hashTable.keys();
		
		while(enumeration.hasMoreElements()) {
			
			String element = enumeration.nextElement();			
			System.out.println("Key is : "+element+" Value is : "+hashTable.get(element));
		}
		
	}

}
