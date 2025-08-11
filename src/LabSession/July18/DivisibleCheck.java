package LabSession.July18;

public class DivisibleCheck {
    public static void main(String[] args) {
        int num = 55;

        if (num % 5 == 0 && num % 11 == 0)
            System.out.println(num + " is divisible.");
        else
            System.out.println(num + " is not divisible.");
    }
}
