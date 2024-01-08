package map;

import java.util.TreeMap;

public class TreeMapConstructorOne {
	
	public static void constructorOneExample() {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(20, "Hydrabad");
		treeMap.put(30, "Chennai");
		treeMap.put(10, "Sikandarbad");
		treeMap.put(15, "Bengluru");
		
		System.out.println(treeMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TreeMap using the constructor TreeMap().....\n");
		
		constructorOneExample();
	}

}
