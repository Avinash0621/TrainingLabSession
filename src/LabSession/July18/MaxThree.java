package LabSession.July18;

public class MaxThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 19;
        int c = 17;

        if (a >= b && a >= c)
            System.out.println(a + " is the greatest.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the greatest.");
        else
            System.out.println(c + " is the greatest.");
    }
}
