package loop3;

import java.util.Scanner;

public class Text3 {
	int n ;
	void m1() {
		if(n%2==0)
		{
			System.out.println("Number is even ");
		}
		else {
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		Text3 obj = new Text3();
		obj.m1();
		
	}

}
