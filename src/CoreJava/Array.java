package CoreJava;

public class Array {

	public static void main(String[] args) {

		//Single Dimensional Array
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		//Multi Dimensional Array
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
