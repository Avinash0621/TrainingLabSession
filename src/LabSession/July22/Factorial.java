package LabSession.July22;

public class Factorial {

    public static void main(String[] args) {
        int num = 4;
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
