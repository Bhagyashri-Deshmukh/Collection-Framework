package list;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		
		vector.add("Bhagyashri");
		vector.add("Pinki");
		vector.add("Neha");
		
		System.out.println("Elements in vector are : \n");
		System.out.println(vector);
		
		System.out.println("\n");
		
		vector.remove(2);
		
		System.out.println("Elements in vector after removing one are : \n");
		System.out.println(vector);
		
		System.out.println("==========================================================================");
		
		for(int i=0;i<vector.size();i++) {
			System.out.println("Element in vector at index "+i+" is: "+vector.get(i));
		}
	}

}
