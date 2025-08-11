package LabSession.July22;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;

        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
