package handling2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class B {

	void read() throws FileNotFoundException 
	{
		FileInputStream fls = new FileInputStream("E://do.txt");
		
	}

	public static void main(String[] args)  {
		
		B obj = new B();
		try {
			obj.read();
			System.out.println("fil open");
		} catch (FileNotFoundException e) {
			
			System.out.println("FileNotFound");
		}

	}

}
