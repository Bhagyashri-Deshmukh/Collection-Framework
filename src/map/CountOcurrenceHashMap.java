package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CountOcurrenceHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,4,1,5,7,5,9,1,9,6};
		
		// Add all elements from array to array list
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			
			arrayList.add(array[i]);
		}
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arrayList.size();i++) {
			
			hashMap.putIfAbsent(arrayList.get(i), Collections.frequency(arrayList, arrayList.get(i)));
		}
		
		System.out.println("Hash map with frequency of elements is \n");
		System.out.println(hashMap);
	}

}
