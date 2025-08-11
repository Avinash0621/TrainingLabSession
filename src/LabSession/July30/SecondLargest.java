package LabSession.July30;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 50, 30, 90, 70));

        Collections.sort(numbers); 								// Sort ascending
        int secondLargest = numbers.get(numbers.size() - 2);

        System.out.println("Numbers: " + numbers);
        System.out.println("Second Largest: " + secondLargest);
    }
}
