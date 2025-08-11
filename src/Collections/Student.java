package Collections;

import java.util.*;

public class Student implements Comparable<Student> {
		
	int rollNumber;
	String name;
		
	//Constructor of the class to pass the parameters
		
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
		
	//Implement CompareTo method for natural Ordering (By rollNumber)
	public int compareTo(Student s) {
		return this.rollNumber - s.rollNumber;
	}
		
	public String toString() {
		return rollNumber + " - " + name;
	}
	
	
	//Sort a List by Roll Number (Ascending)
	public static void main(String[] args) {
		
		List<Student> stu = new ArrayList<>();
		
		stu.add(new Student(101,"Avinash"));
		stu.add(new Student(105,"Ravi"));
		stu.add(new Student(103,"Pawan"));
		stu.add(new Student(102,"Deepak"));
		stu.add(new Student(104,"Zara"));
		
		//Sort using Collections.sort()
        Collections.sort(stu);

        //Display sorted list
        for (Student s : stu) {
            System.out.println(s);
        }
	
	}
}
