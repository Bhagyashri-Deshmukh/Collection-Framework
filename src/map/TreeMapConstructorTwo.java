package map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapConstructorTwo {
	
	public static void sortByRollNumber() {
		
		TreeMap<Student, Integer> treeMap =
				new TreeMap<Student, Integer>(new SortByRollNumber());
		
		treeMap.put(new Student(111, "Neha", "Pune"), 2);
		treeMap.put(new Student(131, "Priya", "Mumbai"), 3);
		treeMap.put(new Student(121, "Kriti", "Mumbai"), 1);
		
		System.out.println("Treemap using comparator is \n");
		System.out.println(treeMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortByRollNumber();
	}

}

class Student{
	
	public int rollNumber;
	private String name;
	private String address;
	
	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

}

class SortByRollNumber implements Comparator<Student>{

	// here we are sorting in ascending order of roll number.
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNumber - o2.rollNumber;
	}	
}