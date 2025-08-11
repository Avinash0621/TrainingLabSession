package LabSession.July24;

abstract class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract String getGrade();
}

class EngineeringStudent extends Student {
    int marks;

    EngineeringStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    @Override
    String getGrade() {
        if (marks >= 85) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}

class MedicalStudent extends Student {
    int marks;

    MedicalStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    @Override
    String getGrade() {
        if (marks >= 80) return "Distinction";
        else if (marks >= 60) return "First Class";
        else if (marks >= 40) return "Second Class";
        else return "Fail";
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student engStudent = new EngineeringStudent("Rahul", 101, 78);
        Student medStudent = new MedicalStudent("Priya", 102, 82);

        System.out.println("Name: " + engStudent.name + ", Roll No: " + engStudent.rollNo +", Grade: " + engStudent.getGrade());
        System.out.println("Name: " + medStudent.name + ", Roll No: " + medStudent.rollNo +", Grade: " + medStudent.getGrade());
    }
}
