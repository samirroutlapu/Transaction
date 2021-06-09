package handling1;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		//Handle  Arithmetic Exception
			try
			{
				int x = scan.nextInt();
				int y = scan.nextInt();
				int z = x/y;//Arithmetic Exception
				System.out.println("Z value is "+z);
			}catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println("end");
	}

}
  