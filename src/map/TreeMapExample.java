package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Integer> treeMap = new TreeMap<>();
		 
	        treeMap.put("Beed", 1);
	        treeMap.put("Nashik", 3);
	        treeMap.put("Mumbai", 2);
	 
	        int valueBeed = treeMap.get("Beed");
	        System.out.println("Value of Beed: " + valueBeed);
	 
	        // Removing elements from the tree map
	        treeMap.remove("Nashik");
	        
	        //set view of tree map
	        System.out.println("Set view : "+treeMap.keySet());
	 
	        // Iterating over the elements of the tree map
	        for (String key : treeMap.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
	        }
	}

}
