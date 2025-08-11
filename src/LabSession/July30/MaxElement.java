package LabSession.July30;

import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 45, 7, 99, 34));

        int max = Collections.max(numbers);

        System.out.println("Numbers: " + numbers);
        System.out.println("Maximum Element: " + max);
    }
}

