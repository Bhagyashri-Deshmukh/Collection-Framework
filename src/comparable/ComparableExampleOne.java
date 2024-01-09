package comparable;

import java.util.Arrays;

public class ComparableExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 4;
		NumbersAndString array[] = new NumbersAndString[size];
		
		array[0] = new NumbersAndString(3, "abc");
		array[1] = new NumbersAndString(4, "a");
		array[2] = new NumbersAndString(5, "bc");
		array[3] = new NumbersAndString(2, "a");
		
		Arrays.sort(array);
		
		printArray(array);
	}

	private static void printArray(NumbersAndString[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
	}

}


