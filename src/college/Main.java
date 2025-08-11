package college;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        //s.studentName = "John";    //Not accessible because private
        s.displayStudent();          // Access through public method
    }
}