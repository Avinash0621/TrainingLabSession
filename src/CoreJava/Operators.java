package CoreJava;

public class Operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int i = 10;

		//Unary Operator
		i++;		//++i;
		System.out.println(i);
		i--;		//--i;
		System.out.println(i);
		
		
		//Arithmetic Operator
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		
		
		//Relational Operator
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);

		
		//Shift Operators
		//Left Shift <<
		System.out.println(a<<2);  //10* 2^2 = 40
		System.out.println(a<<3);  //10* 2^3 = 80

		//right Shift >>
		System.out.println(a>>2);   //10/ 2^2 = 2
		System.out.println(b>>2);   //20/ 2^2 = 5
		
		
		//Bitwise Operator
		System.out.println(5&7);  //AND  0101 & 0111 = 0101
		System.out.println(5|7);  //OR   0101 | 0111 = 0111
		System.out.println(5^7);  //XOR  0101 ^ 0111 = 0010 (Corresponding bits should different)
		
		
		//Logical Operator
		if((a!=b) && (a<=b)) {
			System.out.println("Both are true");  //(AND)Return true if both operands are true
		}
		
		if((a==b) || (a<=b)) {
			System.out.println("One is true");  //(OR)Return true if only one operands is true
		}
		
		boolean isRaining = false;   //(!NOT)Reverse Logical state of operand
		if(!isRaining) {
			System.out.println("You can go out");
		}
		
		
		//Assignment Operator
		int m= 10;
		int n= 5;
		
		m += 4;
		n -= 2;
		
		System.out.println(m);
		System.out.println(n);
		
		
		//Ternary Operator
		int a1=20;
		int a2=10;
		
		int max = (a1>a2)?a1:a2;

		System.out.println(max);
		
	}

}
