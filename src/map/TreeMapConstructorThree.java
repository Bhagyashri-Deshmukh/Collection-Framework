package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConstructorThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "xyz");
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(map);
		System.out.println("Tree map using map is \n");
		System.out.println(treeMap);
	}

}
