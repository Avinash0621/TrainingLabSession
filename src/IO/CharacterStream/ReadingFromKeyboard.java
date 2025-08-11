package IO.CharacterStream;

import java.util.Scanner;

public class ReadingFromKeyboard {

	public static void main(String[] args) {
		
		//Creating a scanner class
		Scanner sc = new Scanner(System.in);
		
		//Enter first_name
		System.out.print("Enter the First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second Number : ");
		int b = sc.nextInt();
		
		System.out.println("Sum : " + (a+b));

	}

}
