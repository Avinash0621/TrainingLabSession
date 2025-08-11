package LabSession.July30;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
    	
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(42);
        numbers.add(15);
        numbers.add(7);
        numbers.add(89);
        numbers.add(23);

        System.out.println("Before sorting: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);
    }
}
