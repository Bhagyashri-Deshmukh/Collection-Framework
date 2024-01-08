package map;

import java.util.Map;
import java.util.TreeMap;

public class OperationsOverTreeMap {
	
	static TreeMap<String, String> treeMap;
	
	// create and Add an element to the tree map
	public static void createAndAdd() {
		
		treeMap = new TreeMap<String, String>();
		
		treeMap.put("Pune", "Maharashtra");
		treeMap.put("Mumbai", "Maharashtra");
		treeMap.put("Nashik", "Maharashtra");
		treeMap.put("Jalgao", "Maharashtra");
		treeMap.put("Latur", "Maharashtra");
		treeMap.put("Osmanabad", "Maharashtra");
		
		System.out.println("Adding and creating tree map \n");
		System.out.println(treeMap);
	}
	
	// Remove an element from the tree map
	public static void remove() {
			
		treeMap.remove("Nashik");
		System.out.println("Tree map after removing key - Nashik. \n");
		System.out.println(treeMap);
	}
	
	// traverse a tree map
	public static void traverse() {
				
		System.out.println("Traversing the tree map \n");
		for(Map.Entry<String, String>  map : treeMap.entrySet()) {
			
			System.out.println(map.getKey()+" => "+map.getValue());
		}
	}
	
	// search an element from tree map
	public static void search(String key) {
		
		if(treeMap.containsKey(key)) {
			
			System.out.println(key+" is present in tree map.");
		}
		else {
			System.out.println(key+" is not present in tree map.");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================================================");
		createAndAdd();
		System.out.println("================================================================");
		remove();
		System.out.println("================================================================");
		traverse();
		System.out.println("================================================================");
		search("Nashik");
		System.out.println("================================================================");
	}

}
