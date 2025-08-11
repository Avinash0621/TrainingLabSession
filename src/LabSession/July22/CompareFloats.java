package LabSession.July22;

public class CompareFloats {

    public static void main(String[] args) {
    	double num1 = 1235;
    	double num2 = 2534;
    	
        int n1 = (int)(num1 * 100);
        int n2 = (int)(num2 * 100);

        if (n1 == n2) {
            System.out.println("Numbers are the same up to two decimal places.");
        } else {
            System.out.println("Numbers are different.");
        }
    }
}
