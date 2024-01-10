package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arrayList= new ArrayList<Student>();
		arrayList.add(new Student(111, "Asmita", "Indore"));
		arrayList.add(new Student(131, "Radhika", "Pune"));
		arrayList.add(new Student(121, "Yati", "Osmanabad"));
		arrayList.add(new Student(101, "Vihan", "Punjab"));
		
		System.out.println("Array List of un sorted students is \n");		
		
		for(Student stu:arrayList) {
			System.out.println(stu);
		}
		
		System.out.println("\n=================================================================");
		
		Collections.sort(arrayList, new SortByRollNumber());
		
		System.out.println("Array List of sorted students(By Roll Number) is \n");		
		
		for(Student student:arrayList) {
			System.out.println(student);
		}
		
		System.out.println("\n=================================================================");
		
		Collections.sort(arrayList, new SortByName());
		
		System.out.println("Array List of sorted students(By Name) is \n");	
		
		for(Student student:arrayList) {
			System.out.println(student);
		}
	}

}
