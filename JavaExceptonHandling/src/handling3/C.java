package handling3;


import java.util.*;
import java.util.Scanner;

public class C {
	

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
			catch(InputMismatchException e)
			{
				System.out.println(e);
			}
		System.out.println("End");
		
		
		
		
		
	

	}

}
