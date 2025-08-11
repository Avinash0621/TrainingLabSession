package LabSession.Aug01;

import java.util.Scanner;

public class ReadConsoleInput {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter the First Name : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second Name : ");
		int b = sc.nextInt();
		    	
        
        System.out.println("Hello, " + a);
    }
}
