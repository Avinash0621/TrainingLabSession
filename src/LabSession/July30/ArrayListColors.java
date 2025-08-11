package LabSession.July30;

import java.util.ArrayList;

public class ArrayListColors {
    public static void main(String[] args) {

    	ArrayList<String> col = new ArrayList<>();

        col.add("Red");
        col.add("Green");
        col.add("Blue");
        col.add("Yellow");
        col.add("Orange");

        System.out.println("Colors in the list: " + col);
        
        //For Printing Individually
        System.out.println("Individual colors:");
        for (String color : col) {
            System.out.println(color);
        }
    }
}

