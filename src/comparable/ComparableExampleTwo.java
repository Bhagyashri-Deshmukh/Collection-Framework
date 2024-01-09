package comparable;

import java.util.Arrays;

public class ComparableExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size =4;
		StringAndString array[] = new StringAndString[size];
		array[0] = new StringAndString("Pune","Maharashtra");
		array[1] = new StringAndString("Hydrabad","Telangana");
		array[2] = new StringAndString("Chennai","TamilNadu");
		array[3] = new StringAndString("Bengluru","Karnataka");
		
		Arrays.sort(array);
		
		printArray(array);
	}

	private static void printArray(StringAndString[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
		}
	}

}
