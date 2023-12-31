package list;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=1;i<11;i++) {
			arrayList.add(i);
		}
		
		System.out.println("ArrayList is as follows:\n");
		System.out.println(arrayList);
		System.out.println("===============================================================");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println("Element at index "+i+" is "+arrayList.get(i));
		}
	}

}
