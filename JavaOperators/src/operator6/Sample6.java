package operator6;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x<y)
		{
			System.out.println("  x is Smaller number");
		}
		else
		{
			System.out.println(" x is Greater number ");
		}

	}

}
