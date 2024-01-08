package map;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMapConstructorFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer, String> sortedMap = new ConcurrentSkipListMap<Integer, String>();
		sortedMap.put(12, "abc");
		sortedMap.put(11, "xyz");
		sortedMap.put(10, "pqr");
		sortedMap.put(13, "mnp");
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(sortedMap);
		

        System.out.println("TreeMap using TreeMap(SortedMap) constructor \n");
        System.out.println(treeMap);
	}

}
