package LabSession.July23;

public class SumOfArray {

    public static void main(String[] args) {
    	int size = 5;
        int sum = 0;
        int[] arr = {10,20,30,40,50};
        
        for(int i = 0; i < size; i++) {
            sum += arr[i];  
        }

        System.out.println("Sum of array elements is: " + sum);
    }
}
