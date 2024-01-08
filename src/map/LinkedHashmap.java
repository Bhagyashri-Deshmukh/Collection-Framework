package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map =  new LinkedHashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		
		System.out.println("Linked hash map has following values \n");
		
		for(Map.Entry<Integer, String> mapEntry : map.entrySet() ) {
			
			System.out.println(mapEntry.getKey()+" => "+mapEntry.getValue());
		}
	}

}
