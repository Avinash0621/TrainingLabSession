package LabSession.July30;

import java.util.*;

public class LinkedListEquality {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C"));
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("A", "C", "B"));

        System.out.println("List1 equals List2? " + list1.equals(list2)); 
        System.out.println("List1 equals List3? " + list1.equals(list3)); 
    }
}
