package stream1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	

	public static void main(String[] args)  {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\fls.txt");
			
			String str = "Welcom";
			byte arr[]=str.getBytes();
			
			
			fout.write(arr);
			fout.close();
			
			
			
			System.out.println("Success");
			
			
		} catch (Exception e) {
		
			System.out.println(e);
		}
		
	}

}
