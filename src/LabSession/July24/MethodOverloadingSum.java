package LabSession.July24;

public class MethodOverloadingSum {

 // This sum takes two int parameters
	public int sum(int a, int b) {
		return (a + b); 
	}

 // This sum takes three int parameters
	public int sum(int a, int b, int c){
		return (a + b + c);
	}
	
// This sum takes four int parameters
	public int sum(int a, int b, int c, int d){
		return (a + b + c + d);
	}

 // This sum takes two double parameters
	public double sum(double a, double b){
     return (a + b);
	}
	
// This sum takes two different data types
	public double sum (int a, double b) {
		return (a + b);
	}

	public static void main(String args[]){
		MethodOverloadingSum s = new MethodOverloadingSum();
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.25, 20.22));
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30, 50));
		System.out.println(s.sum(10, 20.5));
 }
}