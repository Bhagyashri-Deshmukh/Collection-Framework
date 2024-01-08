package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		if(hashMap.isEmpty()) {
			System.out.println("Hash map has no values.");
		}
		
		System.out.println("=========================================================");
		
		hashMap.put(100, "Pune");
		hashMap.put(101, "Mumbai");
		hashMap.put(102, "Nagpur");
		
		System.out.println("Following values are added to hashmap\n");
		System.out.println(hashMap);
		
		System.out.println("=========================================================");
		System.out.println("Value of key 102 is removed from hashmap\n");
		
		// remove value Nagpur who's key is 102.
		hashMap.remove(102);
		System.out.println(hashMap);
		
		System.out.println("=========================================================");
		
		hashMap.put(103, "Nashik");
		hashMap.put(103, "Shirdi");
		
		// iterating a map
		for(Map.Entry<Integer, String> map : hashMap.entrySet()) {			
			System.out.println("Key is : "+map.getKey()+" Value is : "+map.getValue());
		}
		
	}

}
