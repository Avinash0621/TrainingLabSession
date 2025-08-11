package Collections;

import java.util.*;

public class Student2 {

    int rollNumber;
    String name;

    //Constructor
    public Student2(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //toString() for printing
    public String toString() {
        return rollNumber + " - " + name;
    }

    public static void main(String[] args) {

        List<Student2> stu = new ArrayList<>();

        stu.add(new Student2(101, "Avinash"));
        stu.add(new Student2(105, "Ravi"));
        stu.add(new Student2(103, "Pawan"));
        stu.add(new Student2(102, "Deepak"));
        stu.add(new Student2(104, "Zara"));

        //Sort by Name using Comparator
        Collections.sort(stu, new Comparator<Student2>() {
            public int compare(Student2 s1, Student2 s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        //Display sorted list
        for (Student2 s : stu) {
            System.out.println(s);
        }
    }
}
