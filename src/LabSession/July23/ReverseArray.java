package LabSession.July23;

public class ReverseArray {

    public static void main(String[] args) {
        
    	int size = 5;
        int[] arr = {10,20,30,40,50};
        
        System.out.println("Array in reverse order:");
        for(int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
