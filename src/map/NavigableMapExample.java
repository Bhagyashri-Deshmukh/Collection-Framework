package map;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer, String> navigableMap = new TreeMap<Integer, String>();
		
		navigableMap.put(1, "One");
		navigableMap.put(2, "Two");
		navigableMap.put(3, "Three");
		navigableMap.put(4, "Four");
		
		Iterator<NavigableMap.Entry<Integer, String>> iterator = 
				navigableMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			
			NavigableMap.Entry<Integer, String> element = iterator.next();
			System.out.println(element.getKey()+" => "+element.getValue());
		}
	}

}
