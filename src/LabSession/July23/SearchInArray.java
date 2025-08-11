package LabSession.July23;

public class SearchInArray {

    public static void main(String[] args) {
    	int size = 5;
    	int[] arr = {10,20,30,40,50};
		int key = 80;

        boolean found = false;

        for(int i = 0; i < size; i++) {
            if(arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Not found in the array.");
        }
    }
}
