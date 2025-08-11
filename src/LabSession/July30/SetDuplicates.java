package LabSession.July30;

import java.util.*;

public class SetDuplicates {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Orange", "Apple", "Mango", "Banana");

        Set<String> unique = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String item : items) {
            if (!unique.add(item)) { 		//if add returns false, it's duplicate
                duplicates.add(item);
            }
        }

        System.out.println("Original list: " + items);
        System.out.println("Duplicate elements: " + duplicates);
    }
}
